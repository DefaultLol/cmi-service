package com.app.services;

import com.app.entity.Bill;
import com.app.entity.ClientPayment;
import com.app.payments_service.ClientPaymentInfo;
import com.app.utils.ClassExchanger;
import com.app.utils.LoginResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import javax.xml.datatype.DatatypeConfigurationException;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class BillServiceTest {
    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private BillService billService=new BillService();

    @Value("${gatewayUrl}")
    private String url;

    /*@Test
    public void getBills() throws DatatypeConfigurationException {
        ClientPayment clientPayment = new ClientPayment() ;
        clientPayment.setBills(null);
        clientPayment.setFirstName("tarik");
        clientPayment.setFixeNumber("0655");
        clientPayment.setId(2L);
        clientPayment.setPhoneNumber("050501");
        clientPayment.setLastName("younes");
        clientPayment.setIdPayment("lol");

        when(restTemplate.getForObject(url+"2"+"/payment/"+"2"+"/"+"2", ClientPayment.class)).thenReturn(clientPayment);
        ClientPaymentInfo clientPaymentInfo  =new ClientPaymentInfo();
        clientPaymentInfo.setFirstName("tarik");
        clientPaymentInfo.setFixeNumber("0655");
        clientPaymentInfo.setId(2L);
        clientPaymentInfo.setPhoneNumber("050501");
        clientPaymentInfo.setLastName("younes");
        clientPaymentInfo.setIdPayment("lol");
        when(classExchanger.generateClientPaymentInfo(clientPayment)).thenReturn(clientPaymentInfo);
        //billService.getBills("2","2","2");
        assertEquals(true,true)

    }*/

    @Test
    public void getBill() {
        Bill bill = new Bill();
        bill.setId(1L);
        bill.setPayed(true);
        bill.setAmount(2000);
        bill.setBatched(false);
        Date date = new Date();
        bill.setBillingDate(date);
        bill.setPayedDate(date);
        when(restTemplate.getForObject(url+"2"+"/bill/"+1L,Bill.class)).thenReturn(bill);
        billService.getBill("2",1L);
    }

    @Test
    public void payBill() {
        Bill bill = new Bill();
        bill.setId(1L);
        bill.setPayed(true);
        bill.setAmount(2000);
        bill.setBatched(false);
        Date date = new Date();
        bill.setBillingDate(date);
        bill.setPayedDate(date);
        when(restTemplate.getForObject(url+"2"+"/bill/pay/"+1L,Bill.class)).thenReturn(bill);
        billService.payBill(bill,"2");
    }

    @Test
    public void batchBill() {
        Bill bill = new Bill();
        bill.setId(1L);
        bill.setPayed(true);
        bill.setAmount(2000);
        bill.setBatched(false);
        Date date = new Date();
        bill.setBillingDate(date);
        bill.setPayedDate(date);
        when(restTemplate.getForObject(url+"2"+"/bill/pay/"+1L,Bill.class)).thenReturn(bill);
        billService.batchBill(bill,"2");
    }
}
