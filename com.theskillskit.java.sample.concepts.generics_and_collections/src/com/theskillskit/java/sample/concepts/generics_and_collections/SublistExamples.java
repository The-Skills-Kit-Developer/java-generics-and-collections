package com.theskillskit.java.sample.concepts.generics_and_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SublistExamples {

    public static void main(String[] args) {
    //
        indexOfSubList();
    }

    public static  void  indexOfSubList(){

        List<Integer> intList = new ArrayList<>(List.of(1, 5, 2, 3, 4));
        List<Integer> intLinkedList = new LinkedList<>(List.of(1, 5, 2, 3, 4));

        //
        System.out.println("intList: "+ java.util.Arrays.toString(intList.toArray()));
        System.out.println("intLinkedList: "+ java.util.Arrays.toString(intLinkedList.toArray()));

        //sort
        java.util.Collections.sort(intList);
        Collections.sort(intLinkedList);

        System.out.println("intList: "+ java.util.Arrays.toString(intList.toArray()));
        System.out.println("intLinkedList: "+ java.util.Arrays.toString(intLinkedList.toArray()));

        //
        int intListPos = Collections.indexOfSubList(intList,List.of(1,3,4,5));
        System.out.println("indexOfSubList: "+ intListPos);
        assert intListPos == 2;

        System.out.println("--end--");
    }
}
