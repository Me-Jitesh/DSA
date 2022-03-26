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

    public boolean powerOf2Opti2(int num) {

        int setBits = 0;

        while (num != 0) {
            int bit = num & 1;
            if (bit == 1) {
                setBits++;
            }
            num = num >> 1;
        }

        if (setBits == 1) {
            return true;
        }
        return false;
    }

}
