package Class15;

public class Task2 {
    void printEvenOdd(int a){
        if(a%2==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.printEvenOdd(5);
    }

}
