package com.visaka.javatest.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;
//  Constructor
    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
//  Metodos
    public boolean makePayment(double amount) {

//      llamar Gateway o interface
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));

        if (response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }
}
