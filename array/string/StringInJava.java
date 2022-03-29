package array.string;

public class StringInJava {
    String hola = "Hello";

    public void isPalindrome(String str) {
        boolean isPal = true;
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPal = false;
                break;
            } else {
                start++;
                end--;
            }
        }
        System.out.println("isPaindrom : " + isPal);
    }

    public void maxOccCharecter(String str) {
        int[] arr = new int[26];
        str = str.toLowerCase();

        // Create an array of count of charecters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int number = 0;
            number = ch - 'a';
            arr[number]++;
        }

        // find max occurence
        int max = -1;
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) {
                ans = i;
                max = arr[i];
            }
        }
        char finalAns = (char) ('a' + ans);
        System.out.println("Charecter with Maximum Occurrence is : " + finalAns);
    }

    public void replaceSpaces(String str) {

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newString.append('@');
                newString.append('4');
                newString.append('0');
            } else {
                newString.append(str.charAt(i));
            }
        }
        System.out.println("String After replacement with @40  : " + newString);
    }
}
