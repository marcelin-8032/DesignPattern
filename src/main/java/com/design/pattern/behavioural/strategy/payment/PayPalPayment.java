package com.design.pattern.behavioural.strategy.payment;

public class PayPalPayment implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("Payment PayPal done with success");
    }
}
