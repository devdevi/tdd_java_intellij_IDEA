package com.visaka.javatest.payments;

public class PaymentRequest {

    private double amount;
//  Constructor
    public PaymentRequest(double amount) {
        this.amount = amount;
    }
//    Getter

    public double getAmount() {
        return amount;
    }
}
