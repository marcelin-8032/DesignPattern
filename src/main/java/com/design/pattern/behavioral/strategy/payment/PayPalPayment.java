package com.design.pattern.behavioral.strategy.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayPalPayment implements PayStrategy{

    @Override
    public void pay() {
        log.info("Payment PayPal done with success");
    }
}
