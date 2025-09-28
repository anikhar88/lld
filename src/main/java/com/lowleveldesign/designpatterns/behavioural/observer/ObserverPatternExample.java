package com.lowleveldesign.designpatterns.behavioural.observer;

import java.util.HashMap;
import java.util.Map;

public class ObserverPatternExample {
    public static void main(String[] args) {
        Observer emailObserver=new EmailObserver("Ankush");
        Observer smsObserver=new SMSObserver("Neekshit");

        NotificationPublisher publisher = new NotificationPublisher();
        publisher.attach(emailObserver);
        publisher.attach(smsObserver);
        publisher.notifyObservers("FUN Channel subscription");

        publisher.remove(emailObserver);
        publisher.notifyObservers("DISNEY Channel subscription");

        Map map = new HashMap();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
    }
}
