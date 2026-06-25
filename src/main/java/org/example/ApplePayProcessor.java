package org.example;

public class ApplePayProcessor implements Processor {

    private BankService bankService;

    ApplePayProcessor(BankService bankService){
        this.bankService = bankService;
    }

    // Implementation of the interface's abstract method
    public PaymentResult processPayment(Payment payment){
        System.out.println("PROCESSING APPLE PAY PAYMENT...");

        // Get authorization from bank service
        PaymentResult paymentResult = bankService.authoriseApplePay(payment);

        return paymentResult;
    }
}
