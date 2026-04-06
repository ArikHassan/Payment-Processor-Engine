package org.example;

public class BankService {
    private Customer customer;
    private double acctBalance;
    private AccountType acctType;
    private AccountStatus acctStatus;

    public double getacctBalance(){
        return acctBalance;
    };

    public AccountStatus getAcctStatus(){
        return acctStatus;
    }

    public AccountType getAcctType(){
        return acctType;
    }
}
