package Mathematics;

public class FastExponentiation {

    public static void fastExpo(int num, int power) {

        System.out.print("Value Of " + num + "^" + power + "  = :  ");

        int res = 1;

        while (power > 0) {

            if (power % 2 != 0) {
                res = res * num;
            }

            power = power / 2;

            num = num * num;
        }
        System.out.println(res);
    }
}
