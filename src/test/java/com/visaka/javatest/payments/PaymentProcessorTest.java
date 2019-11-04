package com.visaka.javatest.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class PaymentProcessorTest {

//    Campos de la clase de test

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;
//   METODO COMUN PARA EVITAR REPETIR CODIGO
//    hacemos la Before para que jUnit sepa que tiene que ejectuar este metodo antes de.
    @Before
    public void setup() {
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);

    }

    @Test
    public void payment_is_correct() {

//        Simulamos el paymentGateway
//      1.PREPARACION DEL ESCENARIO QUE VAMOS A USAR EN EL TEST
//        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
//        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

//       2. LLAMADA AL METODO QUE QUEREMOS PROBAR
        boolean result = paymentProcessor.makePayment(1000);

//      3. ==== RESULTADO ESPERADO
        assertTrue(result);
    }

    @Test
    public void payment_is_wrong() {

//      1. PREPARACION DEL METODO
//        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
//        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

//      2. EJECT DEL METODO
//      3. CHECK DEL RESULTADO
        assertFalse(paymentProcessor.makePayment(1000));
    }
}