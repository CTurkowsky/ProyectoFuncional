package com.nttdata.repository;

import com.nttdata.model.Credit;
import com.nttdata.model.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OperationRepository {


    public Stream<Operation> getAll(){
        List<Operation> operation = new ArrayList<>();
        operation.add(  new Operation( 1, "deposit",1));
        operation.add(  new Operation( 2, "withdrawal",1));
        operation.add(  new Operation( 3, "withdrawal",1));
        operation.add(  new Operation( 5, "deposit",1));
        operation.add(  new Operation( 6, "deposit",1));
        operation.add(  new Operation( 7, "deposit",1));
        operation.add(  new Operation( 8, "deposit",1));
        return operation.stream();
    }
}
