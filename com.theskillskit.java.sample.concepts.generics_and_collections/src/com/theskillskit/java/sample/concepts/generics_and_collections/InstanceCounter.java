package com.theskillskit.java.sample.concepts.generics_and_collections;

import java.util.Arrays;

public class InstanceCounter<T> {

    public void  printInfo(T[] objArray){

        System.out.println("Contains: "+objArray.length+" instance(s) of "+objArray[0].getClass().toString());
    }

}
