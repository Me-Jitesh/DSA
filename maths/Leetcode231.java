package maths;

public class Leetcode231 {

    public boolean powerOf2(int num) {

        for (int i = 0; i <= 30; i++) {

            int ans = (int) Math.pow(2, i);

            if (ans == num) {
                return true;
            }
        }
        return false;
    }

    public boolean powerOf2Opti(int num) {
        int ans = 1;
        for (int i = 0; i <= 30; i++) {

            if (ans == num) {
                return true;
            }

            if (ans < Integer.MAX_VALUE / 2) {
                ans = ans * 2;
            }
        }
        return false;
    }

}
