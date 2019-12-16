package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Start: Test Case.");
    }
    @After
    public void after(){
        System.out.println("Finish: Test Case.");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Testing: " + oddNumbers.exterminate(numbers));

        Assert.assertTrue(oddNumbers.exterminate(numbers).isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        int x = 21;
        for(int n = 1; n < x; n++){
            numbers.add(n);
        }

         System.out.println("Testing: " + oddNumbers.exterminate(numbers));

         ArrayList<Integer> testList = new ArrayList<>();
         for(int i = 2; i < x; i = i + 2){
             testList.add(i);
         }

         Assert.assertEquals(testList,oddNumbers.exterminate(numbers));
    }
}
