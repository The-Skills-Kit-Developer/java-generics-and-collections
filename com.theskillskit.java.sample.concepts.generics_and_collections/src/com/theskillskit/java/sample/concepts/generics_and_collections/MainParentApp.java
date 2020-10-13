package com.theskillskit.java.sample.concepts.generics_and_collections;

import java.util.List;

public class MainParentApp {
    public static void main(String[] args) {
        FemaleParent mom= new FemaleParent("Deveen","Hunter");
        MaleParent dad = new MaleParent("Ryan","Brown");

        //
        MainParentApp.printPersonName(mom);
        MainParentApp.printPersonName(dad);
        List<Thing> things = List.of(new Thing("House"));
        //MainParentApp.printParentName(things); generates compiler error
        MainParentApp.printParentName(List.of(mom,dad));
        //
        printListOfPersonNames(List.of(mom,dad));

    }

    public static void printListOfPersonNames(List<? extends Person> personList){
        for(var p: personList){
            printPersonName(p);
        }
    }

    public static  <T extends Person> void printPersonName(T person){
        System.out.println(person.getClass().toString()+": "+person.getFirstName());
    }


    public static void printParentName(List<? super Parent> parent){
        for(Object p: parent){
            Person person = (Parent)p;
            System.out.println("Parent: "+ person.getFirstName());
        }
    }
}
