package com.theskillskit.java.sample.concepts.generics_and_collections;

import java.util.*;

public class BinarySearchExamples {
    public static void main(String[] args) {
        binarySearch();
        //
        comparator();
    }

    public static  void  binarySearch(){
        List<Integer> intList = new LinkedList<>(List.of(1,6,7,2,3,0));

        System.out.println("intList: "+ Arrays.toString(intList.toArray()));
        //
        int indx = Collections.binarySearch(intList, 2);
        System.out.println(indx>-1?"Found at: "+indx:"Not found!");
        //
        Collections.sort(intList);
        System.out.println("intList: "+ Arrays.toString(intList.toArray()));
        indx = Collections.binarySearch(intList, 2);
        System.out.println(indx>-1?"Found at: "+indx:"No found!");
    }

    public static void comparator(){
        System.out.println("--Comparator--");
        Comparator<Integer> intDescCompare = Comparator.reverseOrder();

        List<Integer> intList = new LinkedList<>(List.of(1,6,7,2,3,0));
        intList.sort(intDescCompare);
        System.out.println("intList: "+ Arrays.toString(intList.toArray()));
    }
}
