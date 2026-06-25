/*
Functions:
    displayStart()
    displayMenu()
    getMenuChoice()
    getProcessor()
*/

package org.example;

import java.util.Scanner;

public class MainHelper {

    // BUILDS THE APPROPRIATE PROCESSOR BASED ON PAYMENT TYPE & RETURNS IT
    public Processor getProcessor(PaymentType paymentType, BankService bankService){

        Processor processor = null;

        switch (paymentType){
            case CREDIT -> {
                processor = new CreditProcessor(bankService);
            }
            case DEBIT -> {
                processor = new DebitProcessor(bankService);
            }
            case APPLEPAY -> {
                processor = new ApplePayProcessor(bankService);
            }
        }

        return processor;
    }
}
