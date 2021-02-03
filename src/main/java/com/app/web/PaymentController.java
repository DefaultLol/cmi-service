package com.app.web;

import com.app.cmi_service.ClientCreationRequest;
import com.app.cmi_service.ClientCreationResponse;
import com.app.entity.Bill;
import com.app.payments_service.*;
import com.app.services.BillService;
import com.app.services.FormService;
import com.app.services.PaymentService;
import com.app.utils.ClassExchanger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@Endpoint
public class PaymentController {

    @Autowired private FormService formService;
    @Autowired private PaymentService paymentService;
    @Autowired private BillService billService;

    @PayloadRoot(namespace = "http://app.com/payments-service",
            localPart = "getFormsRequest")
    @ResponsePayload
    public GetFormsResponse getForm(@RequestPayload GetFormsRequest request) {
        GetFormsResponse response=new GetFormsResponse();
        response.setForm(formService.getForm(request.getCodeCreance(),request.getCreance()));
        return response;
    }

    @PayloadRoot(namespace = "http://app.com/payments-service",
            localPart = "paymentRequest")
    @ResponsePayload
    public PaymentResponse payBill(@RequestPayload PaymentRequest request) throws DatatypeConfigurationException {
        PaymentResponse response=new PaymentResponse();
        if(paymentService.check_batch(request.getBillID())){
            response.setResponse("Already batched");
            return response;
        }
        Bill bill = billService.getBill(request.getCreancier(),request.getBillID());
        paymentService.paymentRequest(bill,request.getAccountID(),request.getCreancier());
        response.setResponse("Request waiting for approval");
        return response;
    }

    @PayloadRoot(namespace = "http://app.com/payments-service",
            localPart = "getBatchedPaymentRequest")
    @ResponsePayload
    public GetBatchedPaymentResponse getBatchedPayment(@RequestPayload GetBatchedPaymentRequest request) throws DatatypeConfigurationException {
        GetBatchedPaymentResponse response=new GetBatchedPaymentResponse();
        List<PaymentOpInfo> payments=paymentService.getBatchedPayment(request.getAccountID());
        for(PaymentOpInfo payment:payments){
            response.getPayments().add(payment);
        }
        return response;
    }
}
