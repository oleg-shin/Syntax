package Class16;

public class SyntaxEmployee {
    int empID;
    double salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp1 = new SyntaxEmployee();
        SyntaxEmployee emp2 = new SyntaxEmployee();
        emp1.empID = 001;
        emp2.empID = 002;
        emp1.salary = 100000;
        emp2.salary = 100001;

        System.out.println("Employee id is " + emp1.empID + ", salary is " + emp1.salary + " and CEO is " + emp1.CEO);
        System.out.println("Employee id is " + emp2.empID + ", salary is " + emp2.salary + " and CEO is " + emp2.CEO);
    }

}
