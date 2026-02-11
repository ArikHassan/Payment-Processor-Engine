package org.example;

import java.util.UUID;

public class Payment {
    private UUID id  = UUID.randomUUID();
    private double amount;
    private Customer customer;
    private Currency currency;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;

    Payment(double amount, Customer customer, Currency currency, PaymentType paymentType){
        this.amount = amount;
        this.customer = customer;
        this.currency = currency;
        this.paymentType = paymentType;
    }

    public PaymentType getPaymentType(){
        return this.paymentType;
    }

    public UUID getId(){
        return this.id;
    }

    public double getAmount(){
        return this.amount;
    }
}