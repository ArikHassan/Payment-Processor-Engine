package org.example;

public class DebitProcessor implements Processor {

    private BankService bankService;

    DebitProcessor(BankService bankService){
        this.bankService = bankService;
    }

    // Implementation of the interface's abstract method
    public PaymentResult processPayment(PaymentRequest paymentRequest){
        System.out.println("PROCESSING DEBIT PAYMENT ...");

        // Get authorization from bank service
        PaymentResult paymentResult = bankService.authoriseDebit(paymentRequest);

        return paymentResult;
    }
}
