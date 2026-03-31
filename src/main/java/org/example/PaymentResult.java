package org.example;

import java.util.UUID;

public class PaymentResult {
    private PaymentStatus status;
    private String description;
    private UUID paymentId;

    public PaymentResult(UUID paymentId, PaymentStatus status, String description){
        this.paymentId = paymentId;
        this.status = status;
        this.description = description;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public UUID getPaymentId() {
        return paymentId;
    }
}
