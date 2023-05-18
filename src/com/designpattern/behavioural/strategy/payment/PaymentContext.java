package com.designpattern.behavioural.strategy.payment;

public class PaymentContext {

    private PayStrategy payStrategy;

    public PaymentContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    void executePayment(){
        if(payStrategy==null){
            System.err.println("No payment method is defined yet");
            return;
        }
        payStrategy.pay();
    }

}
