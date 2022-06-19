package com.syntax.class19;

public class Students {
    double g1Marks;
    double g2Marks;
    double g3Marks;
    String name;
    Students(String name, double grade1Marks,double grade2Marks,double grade3Marks){
        g1Marks = grade1Marks;
        g2Marks = grade1Marks;
        g3Marks = grade1Marks;
        this.name = name;
    }
    public void calculateAvgGrade(){
        double avgGrade = (this.g1Marks + this.g2Marks + this.g3Marks)/3;
        System.out.println(name + avgGrade);
    }
}
