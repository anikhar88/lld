package com.lowleveldesign.designpatterns.creational.factorymethod;

//4. Concrete Factories
public class PayPalPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
