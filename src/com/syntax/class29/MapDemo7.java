package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 2000.0);
        fruit.put("Orange", 25.0);
        fruit.put("Kiwi", 10.2);
        fruit.put("Banana", 10.2);
        fruit.put("Peach", 10.5);

        Set<Map.Entry<String, Double>> entries = fruit.entrySet();
        // if key contains the letter e and if its price is greater than 10.2
        entries.removeIf(entry->entry.getKey().contains("e")&&entry.getValue()>10.2);
        System.out.println(fruit);
    }
}
