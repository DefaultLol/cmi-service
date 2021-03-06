package com.app.services;

import com.app.utils.AddCreditRequest;
import com.app.utils.PaymentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "account-service",url = "https://ensaspay-zuul-gateway.herokuapp.com/api/account")
public interface AccountService {
    @PostMapping("/payment/addCredit")
    public String addCredit(@RequestHeader("Authorization") String token, @RequestBody AddCreditRequest addCreditRequest);

    @PostMapping("/payment/payBill")
    public String payBill(@RequestHeader("Authorization") String token, @RequestBody PaymentRequest paymentRequest);
}
