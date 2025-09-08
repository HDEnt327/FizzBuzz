package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int num) {
        int steps = 0;
        int n = num;
        while (n > 0){
            if  (n % 2 == 0){
                steps++;
                n = n / 2;
            }
            else {
                steps++;
                n = n - 1;
            }
        }
        return steps;
    }
}
