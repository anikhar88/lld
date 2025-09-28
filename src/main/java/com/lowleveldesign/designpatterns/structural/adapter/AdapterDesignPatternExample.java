package com.lowleveldesign.designpatterns.structural.adapter;

/*
       The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together.
It acts as a bridge between two systems:

Target → The interface the client expects.

Adaptee → The existing class with a different/incompatible interface.

Adapter → Converts the adaptee’s interface into the target’s interface.

Step 1: Define the Target Interface
Step 2: Create the Adaptee (Existing Class)
Step 3: Create the Adapter
Step 4: Client Code
 */

/**
 * This is step 4 with client code
 */
public class AdapterDesignPatternExample {
    public static void main(String[] args) {
        // Using PayPal via Adapter
        BankPaymentProcessor paymentProcessor = new PayPalAdapter("user@example.com");
        paymentProcessor.processPayment("123456", 250.0);
    }
}
