/* CREDIT PROCESSOR Class

    -This class is responsible for processing a CREDIT payment.
*/

package org.example;

public class CreditProcessor implements Processor {
    private BankService bankService;

    CreditProcessor(BankService bankService){
        this.bankService = bankService;
    }

    // Implementation of the interface's abstract method
    public PaymentResult processPayment(Payment payment){
        System.out.println("CREDIT PROCESSING...");

        // TODO PROCESSING LOGIC (PAYMENT IS CURRENTLY NOT BEING USED)

        // CREATE AND RETURN A PAYMENT RESULT OBJECT
        PaymentResult paymentResult = new PaymentResult(payment.getId(), PaymentStatus.SUCCESS, "PAYMENT WAS SUCCESSFUL");
        return paymentResult;
    }
}
