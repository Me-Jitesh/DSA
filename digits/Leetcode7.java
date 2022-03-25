package digits;

public class Leetcode7 {
    
    public int reverseInteger(int num) {
        int ans = 0;
        while (num != 0) {

            int digit = num % 10;

            // Checking for Overflow or Underflow
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0;
            }
            // Reversing the no
            ans = ans * 10 + digit;
            num = num / 10;
        }
        return ans;
    }
}
