package com.design.pattern.behavioral.chainofresponsibility.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreditCardPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000)
            log.info("Paid using credit card:$" + amount);
        else
            next.handlePayment(amount);
    }
}
