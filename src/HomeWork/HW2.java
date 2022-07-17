package HomeWork;
    /*
    We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters and the marks in
    four subjects as its parameters for student B.
    Test your code
     */

public class HW2 {
    public static void main(String[] args) {
        StudentA a = new StudentA(5,8,12);
        StudentB b = new StudentB(5, 8, 12, 15);
    }
}
abstract class Marks{
    abstract double getAverage();
    int s1;
    int s2;
    int s3;
}
class StudentA extends Marks{
    @Override
    double getAverage() {
        return (s1+s2+s3)/3;
    }
    StudentA(int s1, int s2, int s3){
        super.s1 = s1;
        super.s2 = s2;
        super.s3 = s3;
        System.out.println(getAverage());
    }
}
class StudentB extends Marks{
    int s4;
    StudentB(int s1, int s2, int s3,int s4){
        super.s1 = s1;
        super.s2 = s2;
        super.s3 = s3;
        this.s4 = s4;
        System.out.println(getAverage());
    }
    @Override
    double getAverage() {
        return (s1+s2+s3+s4)/4;
    }

}
