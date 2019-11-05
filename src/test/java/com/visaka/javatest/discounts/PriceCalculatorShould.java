package com.visaka.javatest.discounts;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    //        instancia de clase
    private  PriceCalculator calculator = new PriceCalculator();

    @Test
    public  void  total_zero_when_there_are_price() {
        assertThat(calculator.getTotal(), is(0.0));
    }
    @Test
    public void total_is_the_sum_of_price() {

        calculator.addPrice(10.0);
        calculator.addPrice(15.0);
        assertThat(calculator.getTotal(), is(25.0));
    }

    @Test

    public void  apply_discount_to_price() {
        calculator.addPrice(12.5);
        calculator.addPrice(17.5);
        calculator.setDiscount(25);
        assertThat(calculator.getTotal(), is(22.5));

    }

}