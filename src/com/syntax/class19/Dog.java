package com.syntax.class19;

class Animal {
    String name;
    String breed;
    int age;
    String color;
    double weight;

    void printInfo() {
        System.out.println("Name " + name + " color is " + color);
    }
}
    public class Dog extends Animal {
        Dog(String name, String color) {
            this.name = name;
            this.color = color;
        }

    }

    class Cat extends Animal {
        Cat(String name, String color) {
            this.name = name;
            this.color = color;
        }

    }


