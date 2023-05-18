package Mathematics;

public class CountDigits {

    public static void countDigitsByUsingLog(int num) {
        if (num == 0) {
            System.out.println("Digits are : 1");
            return;
        }
        // int count = (int)((int)Math.log(num) / Math.log(10))+1;
        int count = (int) Math.log10(num) + 1;
        System.out.println("Digits are : " + count);
    }
}
