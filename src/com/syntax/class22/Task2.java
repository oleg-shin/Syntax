package com.syntax.class22;

public class Task2 {
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String msg){
        System.out.println(msg);
    }
    static void sayHello(String msg, int times){
        for(int a =0; a<times;a++)
        System.out.println(msg);
    }
    public static void main(String[] args) {
        sayHello("Zameer stop wasting time on IG",5);
    }


}

