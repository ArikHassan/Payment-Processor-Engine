package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("Payment Processor Engine");
        System.out.println("************************");

        System.out.println();
        System.out.println("Please select one of the payment methods below");

        // Print all the constants/values of Enum: PaymentType
        for (PaymentType paymentType : PaymentType.values()) {
            System.out.println(paymentType);
        }

    }
}