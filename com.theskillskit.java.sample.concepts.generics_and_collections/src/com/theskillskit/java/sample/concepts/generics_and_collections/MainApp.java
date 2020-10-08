package com.theskillskit.java.sample.concepts.generics_and_collections;

public class MainApp {
    public static  void main(String[] args){

        //
        ConcreteClass[] instanceArray = { new ConcreteClass()};
        OtherConcreteClass[] otherClassArray = {new OtherConcreteClass()};

        InstanceCounter<ConcreteClass> conCounter = new InstanceCounter<>();
        conCounter.printInfo(instanceArray);
        //conCounter.printInfo(otherClassArray);
    }
}
