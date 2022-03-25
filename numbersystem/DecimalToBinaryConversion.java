package numbersystem;

public class DecimalToBinaryConversion {

    public void decimalToBinaryMethod1(int num) {

        int ans = 0;
        int expo = 0;

        while (num != 0) {

            int bit = num & 1;
            ans = (int) (ans + (bit * Math.pow(10, expo))); // Storing The Value(in reverse manner)
            num = num >> 1; // Removing last Bit
            expo++;
        }

        System.out.println("Binary Of Given Number  is : " + ans);
    }

    public void decimalToBinaryNegativeNumMethod1(int num) {

        int ans = 1;
        int expo = 32;
        StringBuilder bin = new StringBuilder();
        while (expo >= 0) {
            expo--;
            int bit = num & 1;
            ans = (bit + (ans * 10)); // Storing The Value as it is(not reversing)
            bin.append(ans);
            System.out.println("Flag " + ans);

            num = num >> 1; // Removing last Bit
        }

        System.out.println("Binary Of Given Number  is : " + bin);
    }
}
