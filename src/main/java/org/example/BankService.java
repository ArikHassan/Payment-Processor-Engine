package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    // Map of customer accounts
    private Map<Customer, BankAccount> accounts = new HashMap<>();

    public BankService(List<Customer> customers){
        for (Customer customer : customers){
            // load the list of customers into Bank service's accounts map
            accounts.put(customer, new BankAccount(customer, 1000, AccountType.DEBIT, AccountStatus.ACTIVE));
        }
    }

    public PaymentResult authorisePayment(Payment payment){
        // TEMP RETURN statement
        return new PaymentResult(payment.getId(), PaymentStatus.SUCCESS, "Payment is authorised");
    }
}
