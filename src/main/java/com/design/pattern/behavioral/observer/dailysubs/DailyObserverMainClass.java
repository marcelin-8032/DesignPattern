package com.design.pattern.behavioral.observer.dailysubs;

public class DailyObserverMainClass {

    public static void main(String[] args) {
        var daily = new Daily();
        var annualSubscriber = new AnnualSubscriber(daily);
        var monthlySubscriber = new MonthlySubscriber(daily);

        daily.setState("News of 17h");
        System.out.println("");
        daily.setState("News of 18h");
    }
}
