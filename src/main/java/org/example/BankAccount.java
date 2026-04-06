package org.example;

public class BankAccount {

    private Customer customer;
    private double acctBalance = 0;
    private AccountType acctType;
    private AccountStatus acctStatus;

    public BankAccount(Customer customer, double acctBalance, AccountType acctType, AccountStatus acctStatus){
        this.customer = customer;
        this.acctBalance = acctBalance;
        this.acctType = acctType;
        this.acctStatus = acctStatus;
    }

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
