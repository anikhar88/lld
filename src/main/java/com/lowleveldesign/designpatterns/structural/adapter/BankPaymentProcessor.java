package com.lowleveldesign.designpatterns.structural.adapter;

// Target interface expected by the banking system
public interface BankPaymentProcessor {
    public void processPayment(String account, double amount);
}
