package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 2000.0);
        fruit.put("Orange", 25.0);
        fruit.put("Kiwi", 10.2);
        fruit.put("Banana", 10.2);
        fruit.put("Peach", 10.5);

        Collection<Double> values = fruit.values();
        values.removeIf(value -> value>10.2);
        System.out.println(fruit);
    }
}
