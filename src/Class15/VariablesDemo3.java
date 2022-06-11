package Class15;

public class VariablesDemo3 {
    static int num = 5;
    String name;

    public static void main(String[] args) {
        VariablesDemo3 v1 = new VariablesDemo3();
        v1.name = "Sadsad";
        VariablesDemo3 v2 = new VariablesDemo3();
        v2.name = "gggg";
        VariablesDemo3 v3 = new VariablesDemo3();
        v3.name = "aaaa";
        System.out.println(v1.name);
        System.out.println(v1.num);
        v1.num=10; // we can reassign value for all
        System.out.println(v2.num);
    }
}
