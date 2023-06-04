package com.design.pattern.behavioral.observer.dailysubs;

public class AnnualSubscriber extends Subscriber {

    public AnnualSubscriber(Daily daily) {
        this.daily = daily;
        daily.register(this);
    }

    @Override
    void notifier() {
        System.out.println("Annual subscriber notification received: " + daily.getState());

    }
}
