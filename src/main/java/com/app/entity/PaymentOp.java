package com.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Document(collection = "paymentOp")
public class PaymentOp {
    @Id
    private String id;
    private Bill bill;
    private String accountID;
}
