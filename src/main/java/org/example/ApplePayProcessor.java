package org.example;

public class ApplePayProcessor implements Processor {

    // Implementation of the interface's abstract method
    public void processPayment(Payment payment){
        System.out.println("APPLE PAY PROCESSOR\n" +
                            "*******************");

        System.out.println("Payment ID: " + payment.getId());
        System.out.println("Amount: $" + payment.getAmount());
    }
}
