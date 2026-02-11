package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // CREATE HELPER OBJECT
    static MainHelper helper = new MainHelper();

    // CREATE SCANNER
    public static Scanner scanner = new Scanner(System.in);

    // CREATE TEST DATA SOURCE OBJ
    public static TestDataSource testDataSource = new TestDataSource();

    // MAIN METHOD
    public static void main(String[] args) {
        helper.displayStart();
        helper.displayMenu();

        // CREATE A PAYMENT PROCESSOR OBJ
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // GET SAMPLE PAYMENT REQUESTS
        ArrayList<Payment> paymentRequests = new ArrayList<Payment>();
        paymentRequests = testDataSource.payments;

        System.out.println("Pending payment count: " + paymentRequests.size());

        // Declare Required Variables
        Payment currentPayment = null;
        Processor currentProcessor = null;

        while (paymentRequests.size() > 0){
            // Get reference to first payment request (FIFO)
            currentPayment = paymentRequests.getFirst();

            //ASSIGN THE APPROPRIATE PROCESSOR TO USE
            currentProcessor = helper.getProcessor(currentPayment.getPaymentType());

            // Process the current payment using appropriate processor
            paymentProcessor.process(currentProcessor, currentPayment);

            // Remove the processed payment from the list
            paymentRequests.removeFirst();

            System.out.println("# of pending payments remaining: " + paymentRequests.size() + "\n" +
                               "-------------------------------------\n");

        }

        System.out.println();
        System.out.println("THERE ARE CURRENTLY NO PENDING PAYMENTS\n" +
                            "******************************");

    }
}