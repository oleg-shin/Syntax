package com.syntax.Class16;

public class Students {
    String Name;
    int ID;
    static int numberOfStudents = 0;

    public static void main(String[] args) {
        Students stu1 = new Students();
        stu1.Name = "Student1";
        stu1.ID = 001;
        stu1.numberOfStudents++;
        Students stu2 = new Students();
        stu2.Name = "Student2";
        stu2.numberOfStudents++;
        stu2.ID = 002;
        Students stu3 = new Students();
        stu3.Name = "Student3";
        stu3.ID = 003;
        stu3.numberOfStudents++;

        System.out.println(numberOfStudents);
    }
}
