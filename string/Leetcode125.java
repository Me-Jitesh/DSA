package string;

public class Leetcode125 {
    
    public void validPalindrome(String str) {

        // Change to Lowercase
        str = str.toLowerCase();

        // Remove Extra Charecters
        StringBuilder validString = new StringBuilder();

        for (int j = 0; j < str.length(); j++) {
            if (validator(str.charAt(j))) {
                validString.append(str.charAt(j));
            }
        }

        // Check Palindrom
        boolean isPal = isPalindrome(validString);
        System.out.println("isPalindrom : " + isPal);
    }

    private boolean validator(char ch) {
        if ((ch >= 'a' && ch < 'z') || (ch >= 'A' && ch < 'Z') || (ch >= '0' && ch < '9')) {
            return true;
        }
        return false;
    }

    private boolean isPalindrome(StringBuilder str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    // private String swap(String str, char i, char next) {
    // char temp = str.charAt(i);
    // str.replace(str.charAt(i), str.charAt(next));
    // str.replace(str.charAt(next), temp);
    // return str;
    // }
}
