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

    // FUNCTION TO ADD PAYMENT CARDS
    public TokenizedCard addPaymentCard(CardDetails newCard){
        // Generate a key/token for this card
        UUID token = UUID.randomUUID();

        // Store card details in the vault
        paymentCards.put(token, newCard);

        // Initialize the tokenized card to return
        TokenizedCard tokenizedCard = new TokenizedCard();
        tokenizedCard.token = token;
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
