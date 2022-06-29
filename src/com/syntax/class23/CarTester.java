package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
//        Car car = new Tesla();
//        car = new Toyota();
//        car.start();
        //Tesla tesla = new Car();
//        BMW bmw = new BMW();
//        bmw.stop();
//        bmw.start();
//        bmw.park();
//        Tesla tesla = new Tesla();
//        tesla.start();
//        tesla.stop();
//        tesla.park();
//        Toyota toyota = new Toyota();
//        toyota.start();
//        toyota.stop();
//        toyota.park();
//
//        Car car = new BMW();
//        car.start();
//        car.stop();
//        car.park();

        Car[] cars = {new BMW(), new Tesla(), new Toyota()};
        for(Car c:cars){
            c.start();
            c.stop();
            c.park();
        }
    }
}
