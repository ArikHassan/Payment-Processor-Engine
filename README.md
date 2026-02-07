Payment Processing Engine
-------------------------

This application simulates a backend system where a customer's
payment is processed.

### Problem Description
This system is designed to be a small component of a larger commerce
application. On a given ecommerce site users need to make payments when making purchases. This program is designed to
facilitate those payments, making sure the correct payment type is selected & processed. Users are given options such as Credit, Debit, or Apple Pay to complete their payment.

### System Design
This program uses the Object-Oriented Programming paradigm to model the objects and behaviours that exist in this system. It leverages key concepts like Inheritance, Encapsulation, Abstraction, & Polymorphism to optimise the reusability, flexibility, & scalability of this application. The program is divided into Classes to combine related data & the methods acting on that data. 
### Flow of operations
- System receives a payment request from the customer
- System validates the request
- System processes the payment
- System delegates the payment request to the customer's bank
- The bank validates the request
- The bank responds to the systems request

