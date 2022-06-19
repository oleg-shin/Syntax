package com.syntax.class20;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    void printInfo(){
        System.out.println("Name " + name + " color " + color);
    }
    Bird(String name, String color, int age, double weight){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    Bird(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
}

class parrot extends Bird{
    parrot(String name, String color, int age, double weight){
        super(name,color,age,weight); // calling parent class constructor by writing the super()
    }

}

class sparrow extends Bird {
    sparrow(String name, String color, int age) {
          super(name, color, age);
    }

}