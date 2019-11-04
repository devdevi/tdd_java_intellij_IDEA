package com.visaka.javatest.utils;

public class DateUtil {



//    Funcion que devuelve si el año es biciesto;
    public static  boolean isLeapYear(int year) {

//        if (year % 4 == 0 && year % 100 != 0 ) {
//
//            return  true;
//        }
//
//        if (year % 400 == 0) {
//            return  true;
//        } else {
//            return false;
//        }

//        REFACTOR
        return  ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0));

    }
}
