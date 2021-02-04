package com.app.batch;

import com.app.dao.PaymentOpRespository;
import com.app.entity.Bill;
import com.app.entity.PaymentOp;
import com.app.services.AccountService;
import com.app.services.AuthService;
import com.app.services.BillService;
import com.app.utils.PaymentRequest;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentItemWriter implements ItemWriter<PaymentOp> {

    @Autowired private BillService billService;
    @Autowired private AccountService accountService;
    @Autowired private AuthService authService;
    @Autowired private PaymentOpRespository repo;
    
    @Override
    public void write(List<? extends PaymentOp> list) throws Exception {
        String token="Bearer " + authService.getAccessToken();
        for(PaymentOp payment:list){
            if(payment.getStatus().equals("pending") && !payment.getBill().getPayed()){
                // if success set bill to payed
                Bill bill=billService.payBill(payment.getBill(),payment.getCreancier());
                //take credit from amount and save historique in account service
                PaymentRequest paymentRequest=new PaymentRequest(bill,payment.getCreancier(),payment.getAccountID());
                accountService.payBill(token,paymentRequest);

                payment.setStatus("closed");
                repo.save(payment);
            }
        }
    }
}
