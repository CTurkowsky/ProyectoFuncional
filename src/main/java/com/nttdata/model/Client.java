package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Client {

    private  Integer id;
    private  String firstName;
    private  String lastName;
    private  String dni;
    private  String clientType;
}
