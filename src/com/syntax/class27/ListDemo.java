package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // we can store the object of a class inside a variable of type parent class
        // or interface if that class implements that interface
        List<String> legends = new ArrayList<>();
        legends.add("Aladin");
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("bbb"));
        System.out.println(legends.size());
        Object [] arr =  legends.toArray();
        System.out.println(arr[0]);
    }
}
