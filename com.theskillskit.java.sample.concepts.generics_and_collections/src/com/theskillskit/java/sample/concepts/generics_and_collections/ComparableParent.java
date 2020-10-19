package com.theskillskit.java.sample.concepts.generics_and_collections;

public class ComparableParent extends  Parent implements Comparable<Parent> {

    public  ComparableParent(){
        super();
    }
    public ComparableParent(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Parent o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }

    @Override
    public String toString() {
        return "First name: "+ this.firstName + " Last name: "+ this.lastName;
    }
}
