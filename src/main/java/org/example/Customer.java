package org.example;

import java.util.UUID;

public class Customer {
    UUID id;
    String name;
    String emailAddress;
    Address address;

    public void createPaymentRequest(){
        System.out.println(this.name + " wants to make a payment request");
    }

    Customer(String name, String emailAddress){
        this.id = UUID.randomUUID();
        this.name = name;
    }

    Customer(String name, String emailAddress, Address address){
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
    }

}
