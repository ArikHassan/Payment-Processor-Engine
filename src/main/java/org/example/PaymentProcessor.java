/* PAYMENT PROCESSOR Class

    -This class receives the correct processor
    for the payment type selected by the user and processes payment using the processor

    -Should receive an input telling it which payment processor to use
*/
package org.example;
import static org.example.Main.helper;

public class PaymentProcessor {

    BankService bankService;

    // CONSTRUCTOR
    PaymentProcessor(BankService bankService){
        this.bankService = bankService;
    };

    // This method accepts a customers' payment + acquires correct processor + tells processor to process payment
    // + returns the result from processor
    public PaymentResult process(Payment payment){

        //ASSIGN THE APPROPRIATE PROCESSOR TO USE
        Processor processor = helper.getProcessor(payment.getPaymentType(), bankService);

        //PASS PAYMENT TO PROCESSOR FOR PROCESSING
        PaymentResult result = processor.processPayment(payment);

        // Return the result from processor
        return result;
    }

}
