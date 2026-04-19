package org.example;

import java.util.*;

public class TestDataSource {

    // LIST OF CUSTOMERS
    public List<Customer> customers = new ArrayList<>();

    // LIST OF ADDRESSES OF CUSTOMERS
    public List<Address> addresses = new ArrayList<>();

    // LIST OF PAYMENTS TO PROCESS
    public List<Payment> payments = new ArrayList<>();

    // LIST OF RAW CARD DATA
    public List<CardDetails> cards = new ArrayList<>();


    TestDataSource(){
        // 10 Sample Addresses
        Address addresses[] = {
                new Address("138 Costary Drive", "Calgary", "Alberta", "Canada"),
                new Address("45 Bay Street", "Toronto", "Ontario", "Canada"),
                new Address("210 King Street West", "Toronto", "Ontario", "Canada"),
                new Address("789 Granville Street", "Vancouver", "British Columbia", "Canada"),
                new Address("1120 Robson Street", "Vancouver", "British Columbia", "Canada"),
                new Address("350 Rue Saint-Paul", "Montreal", "Quebec", "Canada"),
                new Address("980 Bloor Street West", "Toronto", "Ontario", "Canada"),
                new Address("25 Whyte Avenue", "Edmonton", "Alberta", "Canada"),
                new Address("640 Portage Avenue", "Winnipeg", "Manitoba", "Canada"),
                new Address("1550 Bedford Highway", "Halifax", "Nova Scotia", "Canada")
        };
        for (Address address : addresses){
            this.addresses.add(address);
        }

        // 10 Sample Customers
        Customer customers[] = {
                new Customer("Marty Bird", "marty@outlook.com", addresses[0]),
                new Customer("Sarah Ahmed", "sarah.ahmed@gmail.com", addresses[1]),
                new Customer("Daniel Chen", "daniel.chen@yahoo.com", addresses[2]),
                new Customer("Ayesha Khan", "ayesha.khan@outlook.com", addresses[3]),
                new Customer("Michael Thompson", "michael.thompson@gmail.com", addresses[4]),
                new Customer("Fatima Ali", "fatima.ali@yahoo.com", addresses[5]),
                new Customer("James Wilson", "james.wilson@outlook.com", addresses[6]),
                new Customer("Omar Hassan", "omar.hassan@gmail.com", addresses[7]),
                new Customer("Emily Carter", "emily.carter@yahoo.com", addresses[8]),
                new Customer("Noah Patel", "noah.patel@outlook.com", addresses[9])
        };

        for (Customer customer : customers) {
            this.customers.add(customer);
        }

        // 10 Sample Payments
        Payment[] payments = {
                new Payment(120.00, customers[0], Currency.CAD, PaymentType.CREDIT),
                new Payment(75.50, customers[1], Currency.CAD, PaymentType.DEBIT),
                new Payment(240.99, customers[2], Currency.CAD, PaymentType.CREDIT),
                new Payment(19.99, customers[3], Currency.CAD, PaymentType.APPLEPAY),
                new Payment(560.00, customers[4], Currency.CAD, PaymentType.CREDIT),
                new Payment(89.25, customers[5], Currency.CAD, PaymentType.DEBIT),
                new Payment(1500.00, customers[6], Currency.CAD, PaymentType.CREDIT),
                new Payment(45.00, customers[7], Currency.CAD, PaymentType.APPLEPAY),
                new Payment(310.75, customers[8], Currency.CAD, PaymentType.DEBIT),
                new Payment(999.99, customers[9], Currency.CAD, PaymentType.CREDIT)
        };

        for (Payment payment : payments) {
            this.payments.add(payment);
        }

        CardDetails[] cards = {
                new CardDetails("4111 1111 1111 1001", 12, 2028, "123", "Marty Bird", "VISA"),
                new CardDetails("5500 0000 0000 2002", 11, 2027, "456", "Sarah Ahmed", "MASTERCARD"),
                new CardDetails("4111 1111 1111 3003", 10, 2029, "789", "Daniel Chen", "VISA"),
                new CardDetails("3400 0000 0000 400", 9, 2026, "321", "Ayesha Khan", "AMEX"),
                new CardDetails("5500 0000 0000 5005", 8, 2028, "654", "Michael Thompson", "MASTERCARD"),
                new CardDetails("4111 1111 1111 6006", 7, 2027, "987", "Fatima Ali", "VISA"),
                new CardDetails("5500 0000 0000 7007", 6, 2029, "111", "James Wilson", "MASTERCARD"),
                new CardDetails("4111 1111 1111 8008", 5, 2026, "222", "Omar Hassan", "VISA"),
                new CardDetails("3400 0000 0000 900", 4, 2028, "333", "Emily Carter", "AMEX"),
                new CardDetails("5500 0000 0000 1010", 3, 2027, "444", "Noah Patel", "MASTERCARD")

        };

        for (CardDetails card : cards){
            this.cards.add(card);
        }
    }

    // GETTERS

    public List<CardDetails> getCards(){
        return this.cards;
    }

    public List<Customer> getCustomers(){
        return this.customers;
    }

    public List<Payment> getPayments(){
        return this.payments;
    }
    /*--------------------------------------*/


}
