package com.syntax.class20;

public class GrandParent {
    String name = "Anyatullah";

}
class Parent extends GrandParent{
    void printInfo(){
        System.out.println("Name of my father is " + name);
    }
}
class Child extends Parent{
    void printInfo(){
        System.out.println("Name of my Granpa is " + name);
    }
}
