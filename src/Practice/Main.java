
import java.util.LinkedList;


class Main {
    public static void main(String[] args) {

        LinkedList<Integer> primeNum = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
                primeNum.add(i);
        }

        for(int i=primeNum.size()-1; i>=0; i--) {
            if (primeNum.get(i) == 0 || primeNum.get(i) == 1) {
                primeNum.remove(i);
            } else {
                for (int a = 2; a <= primeNum.get(i) / 2; a++) {
                    if (primeNum.get(i) % a == 0) {

                        primeNum.remove(i);
                        break;
                    }
                }
            }
        }
        System.out.println(primeNum);
    }
}