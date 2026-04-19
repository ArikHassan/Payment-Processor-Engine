package org.example;

public class CardDetails {
    String cardNumber;
    int expiryMonth;
    int expiryYear;
    String securityCode;

    String cardholderName;
    String cardNetwork;

    // CONSTRUCTOR
    CardDetails(String cardNumber, int expiryMonth, int expiryYear, String securityCode, String cardholderName, String cardNetwork){
        this.cardNumber =  cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.securityCode = securityCode;
        this.cardholderName = cardholderName;
        this.cardNetwork = cardNetwork;
    }
}
