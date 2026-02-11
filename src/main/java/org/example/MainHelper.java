package org.example;

import java.util.Scanner;

public class MainHelper {

    public void displayStart(){
        System.out.println("Starting Payment Processor Engine...");
        System.out.println("************************************");
        System.out.println();
    }

    public void displayMenu(){
        System.out.println("************************");
        System.out.println("Payment Processor Engine");
        System.out.println("************************");
        System.out.println();
    }

    public PaymentType getMenuChoice(Scanner scanner){
        System.out.println("Please select one of the payment methods below");

        // Declare variables
        int index = 1;
        int userChoice = 0;
        PaymentType paymentType = null;

        // Print all the constants/values of Enum: PaymentType
        for (PaymentType payment_Type : PaymentType.values()) {
            System.out.printf("(%d) " + payment_Type + "\n", index);
            index++;
        }

        // GET INPUT
        userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1 -> {paymentType = PaymentType.DEBIT;}
            case 2 -> {paymentType = PaymentType.CREDIT;}
            case 3 -> {paymentType =  PaymentType.APPLEPAY;}
            default -> {
                System.out.println("Invalid choice");
                paymentType = null;
            }
        }
        return paymentType;
    }

    // BUILDS THE APPROPRIATE PROCESSOR BASED ON PAYMENT TYPE & RETURNS IT
    public Processor getProcessor(PaymentType paymentType){

        Processor processor = null;

        switch (paymentType){
            case CREDIT -> {
                processor = new CreditProcessor();
            }
            case DEBIT -> {
                processor = new DebitProcessor();
            }
            case APPLEPAY -> {
                processor = new ApplePayProcessor();
            }
        }

        return processor;
    }
}
