package com.syntax.class19;

public class Parent {
    String name = "Blabla";
    double money = 1000000;

}
class Child extends Parent {
    void printInfo() {
        System.out.println("My full name is Bloblo" + name);
    }

    void buyCar() {
        System.out.println("Hehehehe buying car from " + name + " money " + money);
    }
}
class Tester{
    public static void main(String[] args) {
        Child child = new Child();
        child.printInfo();
    }
    }
