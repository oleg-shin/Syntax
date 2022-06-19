package com.syntax.class18;

public class ThisKeywordDemo {
    String name = "instance";
    void printName(){
        String name = "Local";
        System.out.println(name);
        System.out.println(this.name); // this keyword is calling the instance variable, not local
    }

    public static void main(String[] args) {
        ThisKeywordDemo t = new ThisKeywordDemo();
        t.printName();
    }
}
