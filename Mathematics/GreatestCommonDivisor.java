package Mathematics;

public class GreatestCommonDivisor {

    public static void GCD(int num1, int num2) {
        int min = (num1 <= num2) ? num1 : num2;
        while (min > 0) {
            if (num1 % min == 0 && num2 % min == 0) {
                System.out.println("GCD is : " + min);
                return;
            }
            min--;
        }
        int max = (num1 <= num2) ? num2 : num1;
        System.out.println("GCD is : " + max);
    }
}
