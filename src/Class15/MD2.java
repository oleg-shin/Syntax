package Class15;

public class MD2 {
    public static void main(String[] args) {
        int[] arr = {123,15435,154,11};
        ArrayUtils a = new ArrayUtils();
        a.printArray(arr);
        int sum = a.sumArray(arr);
        System.out.println(sum);
    }
}
