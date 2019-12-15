package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenList;

    public OddNumbersExterminator(){
        evenList = new ArrayList<Integer>();
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> evenList = new ArrayList<>();
        for (int n = 0; n < numbers.size(); n++){
            if( numbers.get(n) % 2 == 0 ){
                evenList.add(numbers.get(n));
            }
        }
        return evenList;
    }
}
