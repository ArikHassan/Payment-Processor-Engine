package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // SAMPLE DATA
    Address address1 = new Address("138 Costary Drive", "Calgary", "Alberta", "Canada");
    Customer customer1 = new Customer("Marty Bird", "marty@outlook.com", address1);

    // CREATE SCANNER
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // create a payment processor obj
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // SHOW MENU
        paymentProcessor.displayMenu();

        // GET MENU CHOICE
        paymentProcessor.getMenuChoice(scanner);

    }
}