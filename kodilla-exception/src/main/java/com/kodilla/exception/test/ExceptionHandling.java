package com.kodilla.exception.test;

import java.sql.SQLOutput;
import java.time.LocalTime;

public class ExceptionHandling {
    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(3.6, 1.2);
        } catch (Exception e) {
            System.out.println("Exception detected: " + e);
        } finally {
            System.out.println("End of program.");
        }

    }
}
