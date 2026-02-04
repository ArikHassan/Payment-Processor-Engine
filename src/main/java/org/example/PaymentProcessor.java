/* PAYMENT PROCESSOR Class

    -This class is responsible for making sure the correct processor
    is called for the payment type selected by the user

    -Should receive an input telling it which payment processor to use
*/
package org.example;
import java.util.Scanner;

public class PaymentProcessor {

    // CONSTRUCTOR
    PaymentProcessor(){
    };

    public void process(Processor processor){
        processor.processPayment();
    }


}
