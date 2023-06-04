package com.design.pattern.behavioral.strategy.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CashPayment implements PayStrategy{
    @Override
    public void pay() {
        log.info("Payment cash done with success");
    }
}
