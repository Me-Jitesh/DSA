package Mathematics;

public class ArmstrongNumber {
    public static void armstrongNumber(int num) {
        int res = 0;
        int copy = num;
        while (copy > 0) {
            int digit = copy % 10;
            res = res + (int) Math.pow(digit, 3);
            copy /= 10;
        }
        if (res == num)
            System.out.println(num + " Yes ! it is Armstrong Number");
        else
            System.out.println(num + " No ! it is Not A Armstrong Number");
    }
}
