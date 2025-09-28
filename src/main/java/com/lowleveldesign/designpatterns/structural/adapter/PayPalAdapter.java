package com.lowleveldesign.designpatterns.structural.adapter;

public class PayPalAdapter implements BankPaymentProcessor {

    private PayPalGateway payPalGateway;
    private String email;

    public PayPalAdapter(String email) {
        this.email = email;
        this.payPalGateway = new PayPalGateway();
    }
    @Override
    public void processPayment(String account, double amount) {
        // Adapter converts account → email
    payPalGateway.processPayment(email, amount);
    }
}
