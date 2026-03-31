/* PAYMENT PROCESSOR Class

    -This class receives the correct processor
    for the payment type selected by the user and processes payment using the processor

    -Should receive an input telling it which payment processor to use
*/
package org.example;
import static org.example.Main.helper;

public class PaymentProcessor {

    // CONSTRUCTOR
    PaymentProcessor(){
    };

    public PaymentResult process(Payment payment){

        //ASSIGN THE APPROPRIATE PROCESSOR TO USE
        Processor processor = helper.getProcessor(payment.getPaymentType());

        //PASS PAYMENT TO PROCESSOR FOR PROCESSING
        PaymentResult result = processor.processPayment(payment);

        // Return the result from processor
        return result;
    }


}
