package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // CREATE HELPER OBJECT
    static MainHelper helper = new MainHelper();

    // CREATE SCANNER
    public static Scanner scanner = new Scanner(System.in);

    // SAMPLE DATA
    Address address1 = new Address("138 Costary Drive", "Calgary", "Alberta", "Canada");
    Customer customer1 = new Customer("Marty Bird", "marty@outlook.com", address1);

    // MAIN METHOD
    public static void main(String[] args) {

        helper.displayMenu();

        // CREATE A PAYMENT PROCESSOR OBJ
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // CREATE A PROCESSOR OBJ
        Processor processor = null;

        // GET MENU CHOICE
        PaymentType paymentType = null; // not selected yet

        while (paymentType == null) {
            paymentType = helper.getMenuChoice(scanner);
        }
        // IF SELECTION IS A VALID CHOICE
        if (paymentType != null) {
            System.out.println("You chose: " + paymentType);
        }

        //ASSIGN THE APPROPRIATE PROCESSOR TO USE
        processor = helper.getProcessor(paymentType);

        // TELL PAYMENTPROCESSOR TO PROCESS PAYMENT USING THE PASSED PROCESSOR
        paymentProcessor.process(processor);

    }
}