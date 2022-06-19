package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}
class Wood{
    String color = "Blue";
}
class Furniture extends Wood{

    String color = "Black";
}
class Chair extends Furniture{
    String color = "Grey";
    void printColor(){
        String color = "White";
        System.out.println(this.color); // this.color = grey
        System.out.println(super.color);// super.color = Black from the closest parent class
        System.out.println(color); // color = White (local)
    }
}
// always local variables are preferred