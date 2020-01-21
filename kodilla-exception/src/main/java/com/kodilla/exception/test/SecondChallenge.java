package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double a, double b ) throws Exception {
        if( a >= 2 || a < 1 || b == 1.5) {
            throw new Exception();
        }
        return "Done";
    }
}
