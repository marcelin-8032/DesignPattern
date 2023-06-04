package com.design.pattern.behavioral.strategy.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreditCardPayment implements PayStrategy{

    @Override
    public void pay() {
        log.info("Payment CreditCard done with success");
    }
}
