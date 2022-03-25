package numbersystem;

public class BinaryToDecimalConversion {
    public void binaryToDecimalMethod1(int num) {

        int ans = 0;
        int expo = 0;

        while (num != 0) {

            int digit = num % 10;

            if (digit == 1) {
                ans = (int) (ans + Math.pow(2, expo)); // Storing The Value
            }

            num = num / 10; // Removing last Digit
            expo++;
        }

        System.out.println("Decimal Of Given Binary Number  is : " + ans);
    }
}
