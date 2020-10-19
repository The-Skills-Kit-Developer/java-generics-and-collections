package com.theskillskit.java.sample.concepts.generics_and_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        comparable();
    }

    static  void comparable(){
        ComparableParent p1 = new ComparableParent("Ryan", "Brown");
        ComparableParent p2 = new ComparableParent("Deveen","Brown");

        List<ComparableParent> pList = new LinkedList<>(List.of(p1,p2));

        //
        System.out.println("PList: "+ Arrays.toString(pList.toArray()));
        //
        Collections.sort(pList);
        //
        System.out.println("PList: "+ Arrays.toString(pList.toArray()));
    }
}
