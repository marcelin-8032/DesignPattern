package com.design.pattern.behavioural.strategy.payment;

public class PaymentStrategyMain {


    public static void main(String[] args) {
        var context0=new PaymentContext(null);
        context0.executePayment();


        var context=new PaymentContext(new PayPalPayment());
        context.executePayment();

        var context2=new PaymentContext(new CashPayment());
        context2.executePayment();

        var context3=new PaymentContext(new CreditCardPayment());
        context3.executePayment();
    }
}
