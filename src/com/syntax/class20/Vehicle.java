package com.syntax.class20;

public class Vehicle {
    int engineHP;
    String make;
    String model;
    String color;
}
class Car extends Vehicle{
    String steeringType;
    boolean autoType;
    int noOfWindows;
}
class BMW extends Car{
    int topSpeed;
    void printBasciInfo(){
        System.out.println(engineHP);
    }
}
