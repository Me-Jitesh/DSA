package string;

public class Leetcode567 {

    public boolean permutationInString(String s1, String s2) {
        int[] count1 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i) - 'a';
            count1[index]++;
        }

        // Traverse subs string in window of size str length and compare
        int j = 0;
        int windowSize = s1.length();
        int[] count2 = new int[26];

        while (j < windowSize && j < s2.length()) {
            int index = s2.charAt(j) - 'a';
            count2[index]++;
            j++;
        }

        if (checkEquals(count1, count2)) {
            return true;
        }

        while (j < s2.length()) {
            char newChar = s2.charAt(j);
            int index = newChar - 'a';
            count2[index]++;

            char oldChar = s2.charAt(j - windowSize);
            index = oldChar - 'a';
            count2[index]--;
            j++;

            if (checkEquals(count1, count2)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkEquals(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}
