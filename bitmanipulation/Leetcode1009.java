package bitmanipulation;

public class Leetcode1009 {

    public int ComplementBase10Integer(int num) {

        int number = num;
        int mask = 0;
        int ans = 0;

        // Check for 0(edge case)
        if (num == 0) {
            return 1;
        }

        // Creating BitMask
        while (number != 0) {
            mask = (mask << 1) | 1;
            number = number >> 1;
        }

        // find Int Value for given integer's Complement
        ans = (~num) & mask;

        return ans;
    }
}
