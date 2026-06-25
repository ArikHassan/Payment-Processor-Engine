/*
-This class represents a Merchant that sells goods & services
-Stores a map containing Card Token(s) for each Customer ID

Functions:
    saveCard()
    getCardToken(UUID customerId)
    getName()
*/

package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Merchant {
    // MERCHANT NAME
    String name;

    // Map: Customer ID : Card Token
    private Map<UUID, TokenizedCard> savedCards = new HashMap<>();

    Merchant(String name) {
        this.name = name;
    }

    public void saveCard(UUID customerId, TokenizedCard cardToken) {
        savedCards.put(customerId, cardToken);
    }

    public UUID getCardToken(UUID customerId) {
        return savedCards.get(customerId).tokenID;
    }

    public String getName(){
        return this.name;
    }
}
