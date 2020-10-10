package com.theskillskit.java.sample.concepts.generics_and_collections;

import java.time.Year;

@FunctionalInterface
public interface AgeComparator<T> {
    int isOlder(T age1, T age2);

}
