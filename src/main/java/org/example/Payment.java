package org.example;

import java.util.UUID;

public class Payment {
    private UUID id;
    private double amount;
    private Customer customer;
    private Currency currency;
    private PaymentType paymentType;

    Payment(double amount, Customer customer, Currency currency, PaymentType paymentType){
        this.amount = amount;
        this.customer = customer;
        this.currency = currency;
        this.paymentType = paymentType;
    }
}