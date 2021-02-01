package com.app.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class AddCreditRequest {
    private String accountID;
    private double credit;

}
