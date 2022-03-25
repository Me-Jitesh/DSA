package numbersystem;

public class DecimalToBinaryConversion {

    public void decimalToBinaryMethod1(int num) {

        int ans = 0;
        int expo = 0;

        while (num != 0) {

            int bit = num & 1;
            ans = (int) (ans + (bit * Math.pow(10, expo))); // Storing The Value
            num = num >> 1; // Removing last Bit
            expo++;
        }

        System.out.println("Binary Of Given Number  is : " + ans);
    }
}
