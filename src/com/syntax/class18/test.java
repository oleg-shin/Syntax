package com.syntax.class18;

class test {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
    test(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }
    test(){}
    void printInfor(){
        System.out.println(schoolName+ batch+ year+ lastDayOfClass);
    }
    public static void main(String[] args){
        test n = new test();
        test m = new test("Syntax",6,2020,"07/30/2020");
        n.printInfor();
        m.printInfor();
    }
}





