package org.example;

import java.util.UUID;

public class CardDetails {
    UUID customerId; // used to link customer : card token

    String cardNumber;
    int expiryMonth;
    int expiryYear;
    String securityCode;

    String cardholderName;
    String cardNetwork;

    // CONSTRUCTOR
    CardDetails(UUID customerId, String cardNumber, int expiryMonth, int expiryYear, String securityCode, String cardholderName, String cardNetwork){
        this.cardNumber =  cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.securityCode = securityCode;
        this.cardholderName = cardholderName;
        this.cardNetwork = cardNetwork;
    }
}
