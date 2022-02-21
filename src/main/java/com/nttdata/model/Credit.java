package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Credit {

    private Integer id;
    private String  creditType;
    private float balance;
    private String  creditTypeCard;
    private float debt;
}
