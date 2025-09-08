package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int total = 0;
        for (int i = 1; i < n; i++){
            if (i % b == 0 || i % a == 0){
                total++;
            }
        }
        return total;
    }

    static int multiples(){
        return multiples(1000, 3, 5);
    }
}
