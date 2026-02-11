package org.example;

public class DebitProcessor implements Processor {

    // Implementation of the interface's abstract method
    public void processPayment(Payment payment){
        System.out.println("DEBIT PROCESSOR\n" +
                            "***************");

        System.out.println("Payment ID: " + payment.getId());
        System.out.println("Amount: $" + payment.getAmount());
    }
}
