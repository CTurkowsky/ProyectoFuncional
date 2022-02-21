package com.nttdata.repository;

import com.nttdata.model.Account;
import com.nttdata.model.Credit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreditRepository {

    public Stream<Credit> getAll(){
        List <Credit> credit = new ArrayList<>();
        credit.add(  new Credit( 1, "personal",15000,"personal",1000));
        return credit.stream();
    }
}
