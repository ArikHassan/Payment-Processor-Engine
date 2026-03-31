package org.example;

public class DebitProcessor implements Processor {

    // Implementation of the interface's abstract method
    public PaymentResult processPayment(Payment payment){
        System.out.println("DEBIT PROCESSING...");

        // TODO PROCESSING LOGIC (PAYMENT IS CURRENTLY NOT BEING USED)

        // CREATE AND RETURN A PAYMENT RESULT OBJECT
        PaymentResult paymentResult = new PaymentResult(payment.getId(), PaymentStatus.SUCCESS, "PAYMENT WAS SUCCESSFUL");
        return paymentResult;
    }
}
