package com.syntax.class26;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aladin");
        names.add("Abu");
        names.add("Magic Carpet");
        names.add("Sherhan");
        System.out.println(names);
        names.remove("Abu");
        System.out.println(names);
        names.remove(2);
    }
}
