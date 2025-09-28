package com.lowleveldesign.designpatterns.creational.factorymethod;
//4. Concrete Factories
public class StripePaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new StripePayment();
    }
}
