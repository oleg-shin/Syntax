package com.syntax.class27;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends= new ArrayList<>(); //recommended
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        ArrayList<String> moreStudents=new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Handan");

        ArrayList<String> allStudents=new ArrayList<>();
        allStudents.addAll(legends);
        allStudents.addAll(moreStudents);
        System.out.println(allStudents);
        allStudents.removeAll(legends); //opposite to addAll method
        System.out.println(allStudents);


    }
}
