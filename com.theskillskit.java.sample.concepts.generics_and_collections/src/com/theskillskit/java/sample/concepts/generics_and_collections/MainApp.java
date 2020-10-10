package com.theskillskit.java.sample.concepts.generics_and_collections;

import java.time.Year;

public class MainApp {
    public static  void main(String[] args){

        //
        ConcreteClass[] instanceArray = { new ConcreteClass()};
        OtherConcreteClass[] otherClassArray = {new OtherConcreteClass()};

        InstanceCounter<ConcreteClass> conCounter = new InstanceCounter<>();
        conCounter.printInfo(instanceArray);
        //conCounter.printInfo(otherClassArray); //produces compiler error

        //
        AgeComparator<Integer> personAge =  (age1,age2) ->{
            System.out.println("Age1: "+age1+", Age2: "+ age2);

                return age1.compareTo(age2);
        };

        AgeComparator<Float> dogAndHumanAge = (dogAge,humanAge)->{
          float humanEq = dogAge * 7;
            System.out.println("Dog Age to human age: "+humanEq+", Human Age: "+ humanAge);
          return humanAge.compareTo(humanEq)*-1;
        };

        System.out.println("Person-To-Person: " + personAge.isOlder(Year.now().getValue()-1981,Year.now().getValue()- 1978));
        System.out.println("Person-To-Dog: "+ dogAndHumanAge.isOlder(2.5f,2.0f));

        MainApp.printValue("Text value");
        MainApp.printValue(9);
        MainApp.printValue(dogAndHumanAge);
    }

    //
    public static  <T> void printValue(T value){
        System.out.println("This is the value: "+ value);
    }
}
