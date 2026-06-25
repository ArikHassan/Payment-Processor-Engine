package org.example;

import java.util.UUID;

public class Payment {
    private UUID id;
    private double amount;
    private Customer customer;
    private Currency currency;
    private PaymentType paymentType;

    public Payment(double amount, Customer customer, Currency currency, PaymentType paymentType){
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.customer = customer;
        this.currency = currency;
        this.paymentType = paymentType;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public UUID getId() {
        return id;
    }

    public UUID getCustomerId(){
        return customer.getId();
    }

    public double getAmount(){
        return amount;
    }
}