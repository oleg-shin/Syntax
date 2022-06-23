package com.syntax.class22;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("Hey we found a girl for you to get married to that girl");
    }
}
class Hamid{
    void getMarried(){
        System.out.println("I want to try someone different first");
    }

    public static void main(String[] args) {
        Hamid hamid = new Hamid();
        hamid.getMarried();

    }
}
