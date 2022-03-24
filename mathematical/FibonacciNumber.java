package mathematical;

public class FibonacciNumber {

    public void fibNumMethod1(int num) {
        int prev = 0;
        int current = 1;
        System.out.print(prev + " " + current);
        for (int i = 1; i <= num; i++) {
            int sum = prev + current;
            System.out.print(" " + sum);
            prev = current;
            current = sum;
        }
    }

}
