package com.nttdata.repository;

import com.nttdata.model.Account;
import com.nttdata.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AccountRepository {


    public Stream<Account> getAll(){
        List <Account> account = new ArrayList<>();
        account.add(  new Account  (1, "570-12345678-0-56","cuenta para ahorrar", 0,"ahorro",2,4,1000,1));
        return account.stream();
    }
}
