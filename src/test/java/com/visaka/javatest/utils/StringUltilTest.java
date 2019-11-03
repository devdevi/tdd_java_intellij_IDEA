package com.visaka.javatest.utils;

//import static org.junit.Assert.*;

public class StringUltilTest {

    public static void main(String[] args) {

        String result = StringUltil.repeat( "Hola", 3 );
        assertEquals(result, "HolaHolaHola");


        String result2 = StringUltil.repeat( "Hola", 1 );
        assertEquals(result2, "Hola");
//        if (result2.equals("HolaHol")){
////            System.out.println("ERROR");
//            throw new RuntimeException("ERROR");
//        }

    }

    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }
}