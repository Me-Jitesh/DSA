package string;

import java.util.Arrays;

public class Leetcode443 {

    public void stringCompression(char[] chars) {
        int i = 0;
        int ansIndex = 0;
        int n = chars.length;
        while (i < n) {
            int j = i + 1;

            while (j < n && chars[i] == chars[j]) {
                j++;
            }
            //Comes out if array completely traversed or  new different charecter incountered

            // Store OldChar
            chars[ansIndex++] = chars[i];

            int count = j - i;

            if (count > 1) {
                String cnt = Integer.toString(count);
                for (int k = 0; k < cnt.length(); k++) {
                    //Converting Count into single digit and saving the ans
                    chars[ansIndex++] = cnt.charAt(k);
                }
            }
            i = j;
        }
        System.out.println(ansIndex);
        System.out.println(Arrays.toString(chars));
    }
}
