package com.syntax.class19;

public class Task3 {
    private static String getwovels(String input){
        return input.replaceAll("[^a,e,i,o,u]","");
    }

    public static void main(String[] args) {
        System.out.println(getwovels("baloo"));
    }
}
