package Mathematics;

public class ReverseNumber {

    public static void reverseNum(int num) {

        int revNum = 0;
        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse is: " + revNum);
    }
}
