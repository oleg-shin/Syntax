package com.syntax.class19;

public class Task8 {
    String name;
    String address;

    Task8(String name, String address){
        this.name = name;
        this.address = address;
    }
     void displayInfo(){
        System.out.println(name + address);
    }

    public static void main(String[] args) {
        Task8 s = new Task8("bla", "blad");
        s.displayInfo();
    }
}
