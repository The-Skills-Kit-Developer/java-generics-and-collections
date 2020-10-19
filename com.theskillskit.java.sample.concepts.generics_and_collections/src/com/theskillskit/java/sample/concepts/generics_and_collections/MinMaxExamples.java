package com.theskillskit.java.sample.concepts.generics_and_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinMaxExamples {
    public static void main(String[] args) {
        //
        minMax();
    }

    public  static void minMax(){
        List<Integer> intList = new ArrayList<>(List.of(1, 5, 2, 3, 4));
        List<Integer> intLinkedList = new LinkedList<>(intList);

       var minInt  = Collections.min(intList);
       var maxInt = Collections.max(intLinkedList);

        System.out.println("Min: "+ minInt+" Max: "+ maxInt);
    }
}
