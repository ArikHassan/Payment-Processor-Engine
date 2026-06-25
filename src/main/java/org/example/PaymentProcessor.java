/*
    -This class receives the correct processor
    for the payment type selected by the user and processes payment using the processor
    -Contains a map of CardTokenID : CardDetails
    -Should receive an input telling it which payment processor to use
    -Stores raw card data in CardDetails objects
*/
package org.example;
import javax.smartcardio.Card;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.example.Main.helper;

public class PaymentProcessor {

    BankService bankService;

    // Map storing Card token ID : Card Details Obj
    private Map<UUID, CardDetails> paymentCards = new HashMap<>();

    // CONSTRUCTOR
    PaymentProcessor(BankService bankService){
        this.bankService = bankService;
    };

    // FUNCTION TO ADD PAYMENT CARDS to database & return card token
    public TokenizedCard addPaymentCard(CardDetails newCard){
        // Generate a key/token for this card
        UUID tokenID = UUID.randomUUID();

        // Store card details in the vault
        paymentCards.put(tokenID, newCard);

        // Initialize the tokenized card to return
        TokenizedCard tokenizedCard = new TokenizedCard();
        tokenizedCard.tokenID = tokenID;
        // Omit dashes or spaces
        String digitsOnly = newCard.cardNumber.replaceAll("\\D", "");
        tokenizedCard.last4Digits = digitsOnly.substring(digitsOnly.length() - 4);

        tokenizedCard.cardNetwork = newCard.cardNetwork;

        return tokenizedCard; // return token back to the merchant --> to be used when initiating payment requests
    }

    // This method accepts a customers' payment + acquires correct processor + tells processor to process payment
    // + returns the result from processor
    public PaymentResult process(Payment payment){

        //ASSIGN THE APPROPRIATE PROCESSOR TO USE
        Processor processor = helper.getProcessor(payment.getPaymentType(), bankService);

        //PASS PAYMENT TO PROCESSOR FOR PROCESSING
        PaymentResult result = processor.processPayment(payment);

        // Return the result from processor
        return result;
    }

}
