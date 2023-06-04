package com.design.pattern.behavioral.observer.dailysubs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DailyObserverMainClass {

    public static void main(String[] args) {
        var daily = new Daily();
        var annualSubscriber = new AnnualSubscriber(daily);
        var monthlySubscriber = new MonthlySubscriber(daily);

        daily.setState("News of 17h");
        log.info("");
        daily.setState("News of 18h");
    }
}
