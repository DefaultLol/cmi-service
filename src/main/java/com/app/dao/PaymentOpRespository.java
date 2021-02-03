package com.app.dao;

import com.app.entity.PaymentOp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentOpRespository extends MongoRepository<PaymentOp,String> {

    public List<PaymentOp> findAllByAccountIDAndStatus(String accountID,String status);
}
