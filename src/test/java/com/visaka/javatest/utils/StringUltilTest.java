package com.visaka.javatest.utils;

//import static org.junit.Assert.*;

public class StringUltilTest {

    public static void main(String[] args) {

        String result = StringUltil.repeat( "Hola", 3 );

        if (result.equals("HolaHolaHola")){
            System.out.println("OK");
        }

        String result2 = StringUltil.repeat( "Hola", 2 );
        if (!result2.equals("HolaHol")){
            System.out.println("ERROR");
        }

    }
}