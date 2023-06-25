package com.design.pattern.behavioral.chainofresponsibility.payment;

public class ChainResponsabilityMain {

    public static void main(String[] args) {

        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler payPal = new PayPalPaymentHandler();

        bank.setNext(creditCard);
        creditCard.setNext(payPal);

        bank.handlePayment(600);
        bank.handlePayment(200);
        bank.handlePayment(1200);
        bank.handlePayment(600);

    }
}
