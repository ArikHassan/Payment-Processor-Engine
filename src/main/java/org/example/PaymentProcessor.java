/* PAYMENT PROCESSOR Class

    -This class receives the correct processor
    for the payment type selected by the user and processes payment using the processor

    -Should receive an input telling it which payment processor to use
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

    // HashMap of user payment data with a unique token/id
    private Map<UUID, CardDetails> paymentCards = new HashMap<>();

    // CONSTRUCTOR
    PaymentProcessor(BankService bankService){
        this.bankService = bankService;
    };

    // FUNCTION TO ADD NEW PAYMENT CARDS + return tokenized card
    public TokenizedCard addPaymentCard(CardDetails newCard){

        // 1. Store the new Card
        // Generate an id for this card
        UUID paymentCardId = UUID.randomUUID();

        // Store card details in the vault
        paymentCards.put(paymentCardId, newCard);

        // 2. Tokenize & return token of new card
        TokenizedCard cardToken = tokenizeCard(newCard, paymentCardId);

        return cardToken; // return token back to the merchant --> to be used when initiating payment requests
    }

    public TokenizedCard tokenizeCard(CardDetails card, UUID tokenID){
        // Initialize the tokenized card to return
        TokenizedCard tokenizedCard = new TokenizedCard();

        // Assign ID
        tokenizedCard.id = tokenID;

        // Omit dashes or spaces from card #
        String digitsOnly = card.cardNumber.replaceAll("\\D", "");

        // Assign last 4 digits
        tokenizedCard.last4Digits = digitsOnly.substring(digitsOnly.length() - 4);

        // Assign card network
        tokenizedCard.cardNetwork = card.cardNetwork;

        // Return token
        return tokenizedCard;
    }

    // This method accepts a customers' payment + acquires correct processor + tells processor to process payment
    // + returns the result from processor
    public PaymentResult process(Payment payment){

        //GET THE APPROPRIATE PROCESSOR TO USE
        Processor processor = helper.getProcessor(payment.getPaymentType(), bankService);

        //PASS PAYMENT TO PROCESSOR FOR PROCESSING
        PaymentResult result = processor.processPayment(payment);

        // Return the result from processor
        return result;
    }

}
