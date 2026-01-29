package org.example;

import java.util.UUID;

public class Payment {
    private UUID id;
    private double amount;
    private Customer customer;
    private Currency currency;
    private PaymentType paymentType;
}