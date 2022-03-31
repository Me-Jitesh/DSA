package recursion;

public class Leetcode509 {

    public int fibonacciNumber(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int ans = fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
        return ans;
    }

}
