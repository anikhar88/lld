package com.lowleveldesign.designpatterns.creational.factorymethod;

/**
 * Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but lets subclasses decide which class to instantiate.
 *
 * In short:
 *
 * Instead of calling new SomeClass() directly → delegate object creation to a factory method.
 *
 * This makes your code loosely coupled, scalable, and testable.
 *
 * 5. Client Code
 */
public class FactoryMethodExample {
    public static void main(String[] args) {
        PaymentFactory factory = new PayPalPaymentFactory();
        Payment payment = factory.createPayment();
        payment.pay(500.00);

        factory = new StripePaymentFactory();
        payment = factory.createPayment();
        payment.pay(750.00);
    }
}
