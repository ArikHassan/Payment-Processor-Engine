package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BankService {

    // HashMap of customers with bank accounts
    // HashMap used here for fast lookup & because order not important
    private Map<UUID, BankAccount> accounts = new HashMap<>();

    public BankService(List<Customer> customers){
        for (Customer customer : customers){
            // load the list of customers into Bank service's accounts map
            accounts.put(customer.getId(), new BankAccount(customer, 1000, AccountType.DEBIT, AccountStatus.ACTIVE));
        }
    }

    public PaymentResult authoriseDebit(PaymentRequest paymentRequest){

        /*
        // Get account where Customer id matches account holders id
        BankAccount account = accounts.get(payment.getCustomerId());

        // No Bank Account for this customer
        if (account == null) {
            return new PaymentResult(payment.getCustomerId(), PaymentStatus.FAILED, "Account not found");
        }
        // Non-Active account status
        else if (account.getAcctStatus() != AccountStatus.ACTIVE){
            return new PaymentResult(payment.getCustomerId(), PaymentStatus.FAILED, "Account status is NOT active");
        }
        // Insufficient funds
        else if (account.getacctBalance() < payment.getAmount()) {
            System.out.println("Insufficient funds");
            return new PaymentResult(payment.getCustomerId(), PaymentStatus.DECLINED, "Insufficient funds");
        }

        // Debit the amount from account
        account.debit(payment.getAmount());
*/
        // Return successful payment result
        return new PaymentResult(paymentRequest.getId(), PaymentStatus.SUCCESS, "Payment is authorised");
    }

    public PaymentResult authoriseCredit(PaymentRequest payment){
// TEMP RETURN statement
        return new PaymentResult(payment.getId(), PaymentStatus.SUCCESS, "Payment is authorised");
    }

    public PaymentResult authoriseApplePay(PaymentRequest paymentRequest){
// TEMP RETURN statement
        return new PaymentResult(paymentRequest.getId(), PaymentStatus.SUCCESS, "Payment is authorised");
    }
}
