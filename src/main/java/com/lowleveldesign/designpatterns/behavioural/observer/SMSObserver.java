package com.lowleveldesign.designpatterns.behavioural.observer;

public class SMSObserver implements Observer {
    private String name;
    public SMSObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println("Sending SMS with message : "+ message);
    }
}
