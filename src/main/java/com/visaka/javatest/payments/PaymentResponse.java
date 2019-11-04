package com.visaka.javatest.payments;

public class PaymentResponse {
//    contiene codigo de respuesta

    enum PaymentStatus {
        OK, ERROR
    }

    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }
//  getter
    public PaymentStatus getStatus() {
        return status;
    }
}
