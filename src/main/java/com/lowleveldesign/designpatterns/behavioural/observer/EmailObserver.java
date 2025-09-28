package com.lowleveldesign.designpatterns.behavioural.observer;

public class EmailObserver implements Observer {
    private String name;
    public EmailObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Sending email with message : "+ message);
    }
}