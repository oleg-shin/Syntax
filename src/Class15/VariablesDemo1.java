package Class15;

public class VariablesDemo1 {
    String breed; // instance
    static int num = 5; // static
    void printName(){
        String name = "Local"; // local variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println(VariablesDemo1.num);
    }
}
