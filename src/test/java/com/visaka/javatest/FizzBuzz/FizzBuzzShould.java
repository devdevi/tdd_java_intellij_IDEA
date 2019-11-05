package com.visaka.javatest.FizzBuzz;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    /*
        Para practicar TDD, realizaremos este ejercicio clásico.Usando TDD (empieza por los tests),
        implementa una función que dado un número:
        Si el número es divisible por 3, retorna “Fizz”
        Si el número es divisible por 5, retorna “Buzz”
        Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
        En otro caso, retorna el mismo número
     */

    @Test
    public  void si_el_número_es_divisible_por_3_retorna_fizz() {
        assertEquals(FizzBuzz.getWord(3,3), "Fizz");
    }
    @Test
    public  void si_el_número_es_divisible_por_5_retorna_buzz() {
        assertEquals(FizzBuzz.getWord(5, 5), "Buzz");
    }

    @Test
    public  void  si_el_número_es_divisible_por_3_y_por_5_retorna_FizzBuzz() {
        assertEquals(FizzBuzz.getWord(15, 5), "FizzBuzz");
        assertEquals(FizzBuzz.getWord(30, 3), "FizzBuzz");
    }

    @Test
    public  void  retorna_el_mismo_número() {
        assertEquals(FizzBuzz.getWord(22, 5), "22");
        assertEquals(FizzBuzz.getWord(31, 3), "31");
    }


//    REFACTOR

    @Test
    public void  Fizz() {
        Assert.assertThat(FizzBuzz.fizzBuzz(18), is("Fizz"));
    }

    @Test
    public void  Buzz() {
        Assert.assertThat(FizzBuzz.fizzBuzz(20), is("Buzz"));
    }
    @Test
    public void  FizzBuzz() {
        Assert.assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
    }

}