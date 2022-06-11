package Class15;

public class Task1 {
    void printLarger(int a, int b){
        int larger =0;
        if(a>b){
            larger = a;
        } else if(b>a){
            larger = b;
        } else {
            larger =a;
        }
        System.out.println(larger);
    }

    public static void main(String[] args) {
        Task1 task = new Task1();
        task.printLarger(12,24);

    }
}
