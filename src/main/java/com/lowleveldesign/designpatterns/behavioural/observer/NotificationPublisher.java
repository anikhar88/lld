package com.lowleveldesign.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationPublisher {

    List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer: list) {
            observer.update(message);
        }
    }
}
