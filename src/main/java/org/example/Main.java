package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Main {

    // CREATE HELPER OBJECT
    static MainHelper helper = new MainHelper();

    // CREATE TEST DATA SOURCE OBJ
    static TestDataSource dataSource = new TestDataSource();

    // MAIN METHOD
    public static void main(String[] args) {

        helper.displayMenu();

        // CREATE BANK SERVICE --> assigning a list of customers
        BankService bankService = new BankService(dataSource.customers);

        // CREATE A PAYMENT PROCESSOR OBJ
        PaymentProcessor paymentProcessor = new PaymentProcessor(bankService);

        PaymentResult paymentResult;

        System.out.println("Engine will now begin processing incoming payments...");

        for (Payment incomingPayment : dataSource.payments) {
            System.out.println("-----------------------------------");
            // TELL PAYMENTPROCESSOR TO PROCESS INCOMING PAYMENT, STORE THE RETURNED RESULT
            paymentResult = paymentProcessor.process(incomingPayment);

            System.out.println("Payment ID: " + paymentResult.getPaymentId().toString());
            System.out.println("Payment Status: " + paymentResult.getStatus());
            System.out.println(paymentResult.getDescription());

        }


    }
}