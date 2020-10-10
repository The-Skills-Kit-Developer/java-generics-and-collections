package com.theskillskit.java.sample.concepts.generics_and_collections;

public class Parent implements Person {
    private String firstName;
    private String lastName;

    public Parent(){

    }

    public  Parent(String firstName, String lastName){
        this();
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
