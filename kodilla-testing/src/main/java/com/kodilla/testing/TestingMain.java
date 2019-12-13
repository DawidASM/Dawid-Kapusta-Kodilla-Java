package com.kodilla.testing;

import com.kodilla.testing.calculator.SimpleCalculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        int result1 = calculator.add(2,2);
        int result2 = calculator.subtract(100,999);

        if(result1 == 4){
            System.out.println("The result is correct.");
        } else {
            System.out.println("Error!");
        }

        if(result2 == 849){
            System.out.println("The result is correct.");
        } else {
            System.out.println("Error!");
        }


    }
}
