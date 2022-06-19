package com.syntax.Class16;

public class Dog {
     String name;
    String color;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bla";
        Dog dog2 = new Dog();
        dog2.name = "Bla bla";
        System.out.println(dog1.name);
        System.out.println(dog2.name);
    }
}

