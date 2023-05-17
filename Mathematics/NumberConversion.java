package Mathematics;

public class NumberConversion {

    public static void decimalToAnyBase(int decimalNum, int base) {
        int resNum = 0;
        int power = 0;
        while (decimalNum > 0) {
            int rem = decimalNum % base;
            decimalNum /= base;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        System.out.println("Result in Base " + base + " is :: " + resNum);
    }

    public static void anyBaseToDecimal(int num, int base) {
        int resNum = 0;
        int power = 0;
        while (num > 0) {
            int unitDigit = num % 10;
            num /= 10;
            resNum += unitDigit * Math.pow(base, power);
            power++;
        }
        System.out.println("Result from Base " + base + " is :: " + resNum);
    }
}
