package com.nttdata.service;

import com.nttdata.model.Account;
import com.nttdata.model.Client;
import com.nttdata.model.Credit;
import com.nttdata.model.Operation;
import com.nttdata.repository.AccountRepository;
import com.nttdata.repository.ClientRepository;
import com.nttdata.repository.CreditRepository;
import com.nttdata.repository.OperationRepository;

import java.net.PortUnreachableException;
import java.util.stream.Collectors;

public class OperationService {

    private AccountRepository accountRepository;
    private ClientRepository clientRepository;
    private CreditRepository creditRepository;
    private OperationRepository operationRepository;
    public OperationService() {
        accountRepository = new AccountRepository();
        clientRepository = new ClientRepository();
        creditRepository = new CreditRepository();
        operationRepository = new OperationRepository();
    }

    public void getAccount(int id) {
        accountRepository.getAll()
                .filter(account -> account.getId().equals(id))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    public void depositAccount(String numberAccount, float amount) {
        accountRepository.getAll()
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .map(account -> account.getBalance() + amount)
                .collect(Collectors.toList())
                .forEach(x -> System.out.println("Your balance is: " + x));


    }

    public void withdrawalAccount(String numberAccount, float amount) {

        accountRepository.getAll()
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .map(account -> account.getBalance() - amount)
                .collect(Collectors.toList())
                .forEach(x -> System.out.println("Withdrawal is " + amount + "Your balance is: " + x));

    }

    public void checkBalanceAccount(String numberAccount) {
        accountRepository.getAll()
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .map(Account::getBalance)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }

    public void chekBalanceCredit(int id) {
        creditRepository.getAll()
                .filter(credit -> credit.getId().equals(id))
                .map(Credit::getBalance)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void payCredit(int id, float amount, float debt) {
        creditRepository.getAll()
                .filter(credit -> credit.getId().equals(id))
                .map(credit -> debt - amount)
                .collect(Collectors.toList())
                .forEach(x -> System.out.println("You paid: " + amount + "Now your debt is: " + x));
    }

    public void chekMovements(int id){
        operationRepository.getAll()
                .filter( operation -> operation.getIdClient().equals(id))
                .map(operation -> operation.getDescription())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
