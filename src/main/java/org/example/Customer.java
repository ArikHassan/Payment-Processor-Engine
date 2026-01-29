package org.example;

import java.util.UUID;

public class Customer {
    private UUID id;
    private String name;
    private String emailAddress;
    private Address address;

    public void createPaymentRequest(){
        System.out.println(this.name + " wants to make a payment request");
    }

    // Constructor 1
    Customer(String name, String emailAddress){
        this.id = UUID.randomUUID();
        this.name = name;
    }

    // Constructor 2
    Customer(String name, String emailAddress, Address address){
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
    }

}
