package lab1;

public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 5 == 0 || i % 3 == 0){
                total++;
            }
        }
        System.out.println(total);
    }
}
