package com.designpattern.behavioural.observer.dailysubs;

import java.util.ArrayList;
import java.util.List;

public class Daily {

    List<Subscriber> subscriberList;

    private String state;


    public Daily() {
        this.subscriberList = new ArrayList<>();
    }

    void register(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }


    void notifySubscribers() {
        for (Subscriber s : subscriberList) {
            s.notifier();

        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifySubscribers();
    }
}
