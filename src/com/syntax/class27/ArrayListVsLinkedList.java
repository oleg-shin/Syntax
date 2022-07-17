package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
            long startTime = System.currentTimeMillis();
        for(int i=0; i<1000000; i++){
            names.add(0, "Captain Aladin");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
