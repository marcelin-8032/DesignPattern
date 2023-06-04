package com.design.pattern.behavioural.strategy.payment;

public class CashPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Payment cash done with success");
    }
}