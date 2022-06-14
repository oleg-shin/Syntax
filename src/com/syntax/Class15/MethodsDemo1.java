package com.syntax.Class15;

public class MethodsDemo1 {
    void method1(){
        System.out.println("I can use print statements in a void method");
        int num=0;
        // return 0; cannot use return in void method
    }

    public static void main(String[] args) {
        MethodsDemo1 methodsDemo1 = new MethodsDemo1();
        //int x = methodsDemo1.method1(); methods with void return that type can't be assign to variable
    }
}
