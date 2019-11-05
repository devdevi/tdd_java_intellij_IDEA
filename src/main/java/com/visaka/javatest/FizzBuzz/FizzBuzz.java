package com.visaka.javatest.FizzBuzz;

public class FizzBuzz {

    public static String getWord(int number, int modulo) {

        if (number % 3 == 0 && number % 5 == 0 ) {
            return "FizzBuzz";
        }

        if (modulo == 3) {
            if (number % 3 == 0) {
                return "Fizz";
            }
        }
        if (modulo == 5) {
            if (number % 5 == 0) {
                return "Buzz";
            }
        }
        return Integer.toString(number);
    }

    public static String fizzBuzz(int n) {

        if (n % 3 == 0 ) return "Fizz";
        return  null;
    }


//    REFACTOR

}
