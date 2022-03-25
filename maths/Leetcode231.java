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

}
