package com.lowleveldesign.designpatterns.creational.factorymethod;

//2. Concrete Products
public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}
