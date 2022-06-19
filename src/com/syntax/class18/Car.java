package com.syntax.class18;

public class Car {
    private String make;
    private String model;
    private String color;

    public Car(){

    }

    public Car(String carMake, String carModel, String carColor){
        make = carMake;
        model = carModel;
        color = carColor;
    }

    public Car(String carModel){
        model = carModel;
    }
    void printCarModel(){
        System.out.println("model " + model);
    }
    /*public Car(String carMake){
        make = carMake; constructor not allowed to have two constructors with the same amount of parameters and type
    }*/
    void printinfo(){
        System.out.println("Make " + make + " Model " + model + " Collor " + color);
    }

}
