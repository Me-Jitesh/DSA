package maths;

//Solved By Binary Search
public class Leetcode69 {

    public void sqrt(int x) {
        System.out.println("Square Root Of Given Number is : " + binarySearch(x));
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