/* CREDIT PROCESSOR Class

    -This class is responsible for processing a CREDIT payment.
*/

package org.example;

public class CreditProcessor implements Processor {

    // Implementation of the interface's abstract method
    public void processPayment(){
        System.out.println("CREDIT PROCESSING...");
    }
}
