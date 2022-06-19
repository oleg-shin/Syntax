package com.syntax.class19;

public class SDET extends Human {
    boolean goodWithJava;
   SDET (String name, String eyeColor, String job, int age, boolean goodWithJava) {
       this.name = name;
       this.eyeColor = eyeColor;
       this.job = job;
       this.age = age;
       this.goodWithJava= goodWithJava;
   }
        void printInfo(){
           System.out.println("My name is " + name + " I do " + job + " I am good with Java " + goodWithJava);

    }

    public static void main(String[] args) {
        SDET sdet = new SDET("Blabla", "blue", "Gym", 28, true);
        sdet.printInfo();
    }
}
