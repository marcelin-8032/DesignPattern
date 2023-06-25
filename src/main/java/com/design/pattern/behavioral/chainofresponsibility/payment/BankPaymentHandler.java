package com.design.pattern.behavioral.chainofresponsibility.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankPaymentHandler extends PaymentHandler{

    @Override
    public void handlePayment(double amount) {
        if(amount<=500)
           log.info("Paid using bank account:$ "+amount);
        else next.handlePayment(amount);
    }


}
