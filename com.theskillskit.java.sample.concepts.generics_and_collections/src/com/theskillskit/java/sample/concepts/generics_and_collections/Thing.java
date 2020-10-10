package com.theskillskit.java.sample.concepts.generics_and_collections;

public class Thing {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Thing(){

    }

    public Thing(String name){
        this.name= name;
    }

}
