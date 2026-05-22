package org.example;

import java.util.UUID;

public class PaymentRequest {
    private UUID id;
    private double amount;
    private Currency currency;
    private PaymentType paymentType;

    public PaymentRequest(double amount, Currency currency, PaymentType paymentType){
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.currency = currency;
        this.paymentType = paymentType;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public UUID getId() {
        return id;
    }


    public double getAmount(){
        return amount;
    }
}