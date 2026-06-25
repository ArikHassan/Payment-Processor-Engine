package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Main {

    // CREATE HELPER OBJECT
    static MainHelper helper = new MainHelper();

    // CREATE SCANNER
    public static Scanner scanner = new Scanner(System.in);

    // CREATE TEST DATA SOURCE OBJ
    static TestDataSource dataSource = new TestDataSource();

    // CREATE A MERCHANT
    public Merchant merchant = new Merchant("Amazon");

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println("Starting Payment Processor Engine...");
        System.out.println("************************************");
        System.out.println();

        System.out.println("************************");
        System.out.println("Payment Processor Engine");
        System.out.println("************************");
        System.out.println();


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