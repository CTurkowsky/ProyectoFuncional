package com.nttdata.repository;
import java.util.ArrayList;
import java.util.List;
import com.nttdata.model.Account;
import com.nttdata.model.Client;
public class ClientRepository {


    public List<Client> getAll(){
        List <Client> client = new ArrayList<>();
        client.add(new Client(1, "Cesar","Rojas","71243278","personal"));
        client.add(new Client(2, "Cesar","Turkowsky","71243277","personal"));

        return client;
    }
}
