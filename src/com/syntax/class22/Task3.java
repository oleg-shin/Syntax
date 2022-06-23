package com.syntax.class22;

public class Task3 {

}
class Programming{
    Programming(){
        System.out.println("I love progrtamming languages");
    }
    Programming(String msg){
        System.out.println("I love " + msg);
    }

    public static void main(String[] args) {
        new Programming();
        new Programming("Java");
    }
}
