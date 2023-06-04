package com.design.pattern.behavioral.observer.dailysubs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MonthlySubscriber extends Subscriber {

    public MonthlySubscriber(Daily daily) {
        this.daily = daily;
        daily.register(this);
    }

    @Override
    void notifier() {
        log.info("Monthly subscriber notification received: " + daily.getState());
    }
}
