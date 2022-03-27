package maths;

//Solved By Binary Search
public class Leetcode69 {

    public void sqrt(int x) {
        System.out.println("Square Root Of Given Number is : " + binarySearch(x));
    }

    public void sqrtMorePrecision(int x, int precision) {

        int intPart = binarySearch(x);
        double factor = 1;
        double ans = intPart;

        for (int i = 0; i < precision; i++) {
            factor = factor / 10;
            for (double j = ans; j * j < x; j = j + factor) {
                // System.out.println(j);
                ans = j;
            }
        }
        System.out.println("Square Root Of Given Number is : " + ans);
    }

    private int binarySearch(int x) {
        int start = 0;
        int end = x;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while (start <= end) {

            int sqr = mid * mid;

            if (sqr == x) {
                return mid;
            }

            if (sqr < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
}