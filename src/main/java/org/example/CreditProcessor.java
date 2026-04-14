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
        System.out.println("PROCESSING CREDIT PAYMENT...");

        // Get authorization from bank service
        PaymentResult paymentResult = bankService.authoriseCredit(payment);

        return paymentResult;
    }
}
