Payment Processing Engine
-------------------------

This application simulates a backend system where a customer's
payment is processed.

### Problem Description
This system is designed to be a small component of a larger 
commerce application. On a given ecommerce site users need to make payments
when making purchases. This program is designed to facilitate those payments,
making sure the correct payment type is selected & processed. Users are
given options such as Credit, Debit, or Apple Pay to complete their payment.

### System Design
This program uses the Object-Oriented Programming paradigm to model the
objects and behaviours that exist in this system. It leverages key
concepts like Inheritance, Encapsulation, Abstraction, & Polymorphism
to optimise the reusability, flexibility, & scalability of this
application. The program is divided into Classes to combine related
data & the methods acting on that data. 

### Flow of operations
- System receives incoming payment requests
- System passes the payment to the payment processor to process
- Payment processor sends payment object to the appropriate processor based on payment type
- Processors relay the payment object to the bank service using designated methods for payment types
- Bank service verifies payment, customer, & account data with their database
    - Does this customer exist in our database?
    - Does this customer have an active account status?
    - Does this customer have sufficient funds / credit available for the transaction?
- Bank service returns a PaymentResult reporting the authorisation status of payment

