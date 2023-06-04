package com.design.pattern.behavioural.strategy.payment;

public class CreditCardPayment implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("Payment CreditCard done with success");
    }
}
