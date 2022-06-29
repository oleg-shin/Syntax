package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("use keys to start me");
    }
    void stop(){
        System.out.println("use breaks to stop me");
    }
    void park(){
        System.out.println("you can park me");
    }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("you can push push start button to start");
    }

    @Override
    void stop() {
        System.out.println("you can autobreaking or manual breaks to stop");;
    }

    @Override
    void park() {
        System.out.println("you can use autoparking feature to park");;
    }
}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("you can start from app");
    }

    @Override
    void stop() {
        System.out.println("you can use auto breaking to stop");
    }

    @Override
    void park() {
        System.out.println("I can park myself");
    }
}
class Toyota extends Car{

}