package com.app.services;

import com.app.entity.Bill;
import com.app.entity.ClientPayment;
import com.app.entity.Form;
import com.app.payments_service.ClientPaymentInfo;
import com.app.payments_service.FormInfo;
import com.app.utils.ClassExchanger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.datatype.DatatypeConfigurationException;

@Service
public class BillService {

    @Autowired
    public RestTemplate restTemplate;

    @Value("${gateway-service}")
    private String url;

    @Autowired
    private ClassExchanger classExchanger;

    public ClientPaymentInfo getBills(String creancier,String genericID,String codeCreance) throws DatatypeConfigurationException {
        ClientPayment info=restTemplate.getForObject(url+creancier+"/payment/"+genericID+"/"+codeCreance,ClientPayment.class);


        return classExchanger.generateClientPaymentInfo(info);
    }

    public Bill getBill(String creancier,long id){
        Bill bill=restTemplate.getForObject(url+creancier+"/bill/"+id,Bill.class);
        return bill;
    }

    public Bill payBill(Bill bill,String creancier){
        Bill response=restTemplate.getForObject(url+creancier+"/bill/pay/"+bill.getId(),Bill.class);
        return response;
    }

    public Bill batchBill(Bill bill,String creancier){
        Bill response=restTemplate.getForObject(url+creancier+"/bill/batch/"+bill.getId(),Bill.class);
        return response;
    }
}
