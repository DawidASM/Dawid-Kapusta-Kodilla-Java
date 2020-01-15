package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){

        //Given
        int[] numbers = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        double expectedAverage = 52.5;
        Assert.assertEquals(expectedAverage,average,0.01);

    }
}
