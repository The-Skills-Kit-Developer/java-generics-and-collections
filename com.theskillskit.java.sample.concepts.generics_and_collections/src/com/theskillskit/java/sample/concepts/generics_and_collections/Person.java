package com.theskillskit.java.sample.concepts.generics_and_collections;

import java.util.UUID;

public interface Person {
    String getFirstName();
    String getLastName();

    default UUID generateId(){
        return UUID.randomUUID();
    }
}
