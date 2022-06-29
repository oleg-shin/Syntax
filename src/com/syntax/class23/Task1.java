package com.syntax.class23;

public class Task1 {
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
        Master master = new Master();
        master.getPrerequisite();
    }
}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Master extends Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need Bachelor degree first");
    }
}