package com.syntax.class20;

public class Task2 {
    public static void main(String[] args) {
        E.printF();
    }
}
class D{
    public static void printF(){
        System.out.println("Method printF in class D");
    }
}
class E extends D{

}