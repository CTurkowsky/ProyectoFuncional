package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

    private  Integer  id;
    private  String numberAccount;
    private  String descriptionAccount;
    private  float commission;
    private String accountType;
    private Integer movements;
    private Integer limitMonthlyMovements;
    private float balance;
    private Integer clientId;
}
