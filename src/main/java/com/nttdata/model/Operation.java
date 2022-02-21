package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Operation {
    private Integer id;
    private String description;
    private Integer idClient;

}
