package com.design.pattern.behavioral.observer.dailysubs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnnualSubscriber extends Subscriber {

    public AnnualSubscriber(Daily daily) {
        this.daily = daily;
        daily.register(this);
    }

    @Override
    void notifier() {
        log.info("Annual subscriber notification received: " + daily.getState());

    }
}
