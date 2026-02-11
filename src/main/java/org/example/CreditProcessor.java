/* CREDIT PROCESSOR Class

    -This class is responsible for processing a CREDIT payment.
*/

package org.example;

public class CreditProcessor implements Processor {

    // Implementation of the interface's abstract method
    public void processPayment(Payment payment){
        System.out.println("CREDIT PROCESSOR\n" +
                            "****************");

        System.out.println("Payment ID: " + payment.getId());
        System.out.println("Amount: $" + payment.getAmount());
    }
}
