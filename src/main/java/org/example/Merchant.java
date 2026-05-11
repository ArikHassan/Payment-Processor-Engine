package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Merchant {

    // Map: Customer ID : Card Token
    private Map<UUID, TokenizedCard> savedCards = new HashMap<>();

    public void saveCard(UUID customerId, TokenizedCard cardToken) {
        savedCards.put(customerId, cardToken);
    }

    public UUID getCardToken(UUID customerId) {
        return savedCards.get(customerId).id;
    }
}
