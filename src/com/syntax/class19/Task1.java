package com.syntax.class19;

public class Task1 {
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Monday";
        System.out.println(Task1.reverseString("Monday"));
    }
}
