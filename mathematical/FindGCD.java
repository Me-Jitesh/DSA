package mathematical;

public class FindGCD {

    // Formula gcd(a - b , b) or gcd(a % b , b) known as Euclid GCD

    public int findGcd(int a, int b) {

        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
