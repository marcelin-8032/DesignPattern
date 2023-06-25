package com.design.pattern.behavioral.chainofresponsibility.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayPalPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1500)
            log.info("Paid using paypal:$" + amount);
        else
            next.handlePayment(amount);
    }
}
