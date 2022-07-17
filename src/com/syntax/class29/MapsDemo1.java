package com.syntax.class29;

import java.util.HashMap;
import java.util.TreeMap;

public class MapsDemo1 {
    public static void main(String[] args) {
        TreeMap<String, Double> fruit = new TreeMap<>();
        fruit.put("Apple", 2000.0); // auto upcasting does not work with wrapper
        fruit.put("Orange", 25.0);
        fruit.put("Kiwi", 10.2);
        fruit.put("Banana", 10.2);
        fruit.put("Apple", 10.5); // overwrites
        System.out.println(fruit);
        System.out.println(fruit.get("Kiwi"));
        System.out.println(fruit.remove("Orange"));
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(10.1));
        System.out.println(fruit.isEmpty());
        fruit.replace("Kiwi", 15.2);
        System.out.println(fruit);
        fruit.put(null, null);
        System.out.println(fruit);
    }
}
