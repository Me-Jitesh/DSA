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
}
