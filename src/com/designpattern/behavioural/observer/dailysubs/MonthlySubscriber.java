package com.designpattern.behavioural.observer.dailysubs;

public class MonthlySubscriber extends Subscriber {

    public MonthlySubscriber(Daily daily) {
        this.daily = daily;
        daily.register(this);
    }

    @Override
    void notifier() {
        System.out.println("Monthly subscriber notification received: " + daily.getState());
    }
}
