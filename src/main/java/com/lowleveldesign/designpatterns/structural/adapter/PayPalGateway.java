package com.lowleveldesign.designpatterns.structural.adapter;

// Adaptee: Third-party PayPal gateway (incompatible interface)
public class PayPalGateway {
    public void processPayment(String email, double amount){
        System.out.println("Payment of $" + amount + " made via PayPal account: " + email);
    }
}
