package com.app.utils;

import com.app.cmi_service.AccountInfo;
import com.app.cmi_service.AgencyInfo;
import com.app.cmi_service.AgentInfo;
import com.app.cmi_service.ClientInfo;
import com.app.creanciers_service.CreanceInfo;
import com.app.creanciers_service.CreancierInfo;
import com.app.entity.*;
import com.app.payments_service.BillInfo;
import com.app.payments_service.ClientPaymentInfo;
import com.app.payments_service.FormInfo;
import com.app.payments_service.PaymentOpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;


@Component
public class ClassExchanger {

    @Autowired
    DateConverter dateConverter;
    @Autowired
    private DateConverter converter;

    public Account generateAccount(AccountInfo accountInfo){
        Account account=new Account(null,accountInfo.getAccountNumber(),accountInfo.getAmount(),accountInfo.getCredit(),
                accountInfo.getStrCreationDate(),null,accountInfo.getAccountType());
        return account;
    }

    public Agency generateAgency(AgencyInfo agencyInfo){
        Agency agency=new Agency(agencyInfo.getId(),agencyInfo.getName(),agencyInfo.getAddress());
        return agency;
    }

    public Agent generateAgent(AgentInfo agentInfo){
        Agent agent=new Agent(agentInfo.getId(),agentInfo.getFirstName(),agentInfo.getLastName(),agentInfo.getPhoneNumber(),agentInfo.getIdentityNumber()
                ,agentInfo.getPatenteNumber(),agentInfo.getEmail(),generateAgency(agentInfo.getAgency()));

        return agent;
    }

    public Client generateClient(ClientInfo clientInfo,Account account,Agent agent){
        Client client=new Client(null,clientInfo.getFirstName(),clientInfo.getLastName(),clientInfo.getAddress(),clientInfo.getCin(),
                clientInfo.getEmail(),clientInfo.getTel(),account,agent);
        return client;
    }

    public CreanceInfo generateCreanceInfo(Creance creance){
        CreanceInfo creanceInfo=new CreanceInfo();
        creanceInfo.setCodeCreance(creance.getCodeCreance());
        creanceInfo.setEndPoint(creance.getEndPoint());
        creanceInfo.setId(creance.getId());
        creanceInfo.setNameCreance(creance.getNameCreance());

        return creanceInfo;
    }

    public CreancierInfo generateCreancierInfo(Creancier creancier){
        CreancierInfo creancierInfo=new CreancierInfo();
        creancierInfo.setCategoryCreancier(creancier.getCategoryCreancier());
        creancierInfo.setCodeCreancier(creancier.getCodeCreancier());
        creancierInfo.setId(creancier.getId());
        creancierInfo.setNameCreancier(creancier.getNameCreancier());
        for(Creance creance:creancier.getListCreances()){
            creancierInfo.getListCreances().add(generateCreanceInfo(creance));
        }

        return creancierInfo;
    }

    public FormInfo generateFormInfo(Form form){
        FormInfo formInfo=new FormInfo();
        formInfo.setId(form.getId());
        formInfo.setLabel(form.getLabel());
        formInfo.setCodeCreance(form.getCodeCreance());
        return formInfo;
    }

    public BillInfo generateBillInfo(Bill bill) throws DatatypeConfigurationException {
        BillInfo billInfo=new BillInfo();
        billInfo.setId(bill.getId());
        billInfo.setAmount(bill.getAmount());
        billInfo.setBillingDate(dateConverter.convertDateToXMLGregorianCalendar(bill.getBillingDate()));
        billInfo.setCodeCreance(bill.getCodeCreance());
        billInfo.setPayed(bill.getPayed());
        billInfo.setIsBatched(bill.isBatched());
        billInfo.setPayedDate(null);

        return billInfo;
    }

    public ClientPaymentInfo generateClientPaymentInfo(ClientPayment clientPayment) throws DatatypeConfigurationException {
        ClientPaymentInfo info=new ClientPaymentInfo();
        info.setId(clientPayment.getId());
        info.setFirstName(clientPayment.getFirstName());
        info.setLastName(clientPayment.getLastName());
        info.setFixeNumber(clientPayment.getFixeNumber());
        info.setIdPayment(clientPayment.getIdPayment());
        info.setPhoneNumber(clientPayment.getPhoneNumber());
        for(Bill bill:clientPayment.getBills()){
            info.getBills().add(generateBillInfo(bill));
        }

        return info;
    }

    public Bill generateBill(BillInfo info){
        Bill bill=new Bill(info.getId(),info.getAmount(),
                null,null,info.getPayed(),info.getIsBatched(),info.getCodeCreance());
        return bill;
    }

    public PaymentOpInfo generatePaymentOpInfo(PaymentOp payment) throws DatatypeConfigurationException {
        PaymentOpInfo info=new PaymentOpInfo();
        info.setAccountID(payment.getAccountID());
        info.setBill(generateBillInfo(payment.getBill()));
        info.setCreancier(payment.getCreancier());
        info.setId(payment.getId());
        info.setStatus(payment.getStatus());
        
        return info;
    }


}
