package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        // when we pass the list to the constructor of the Set and java will create
        // a set out of the list using the same approach we get a list back from the set

        numbers = new ArrayList<>(new LinkedHashSet<>(numbers));
        /*LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(); // creating a set
        linkedHashSet.addAll(numbers); // adding all elements from the list to the set
        numbers = new ArrayList<>(); // creating a new array
        numbers.addAll(linkedHashSet); // adding unique elements only
        */
        System.out.println(numbers);

    }
}
