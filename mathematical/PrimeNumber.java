package mathematical;

public class PrimeNumber {

    public boolean isPrimeNoDivisor(int num) {

        boolean res = false;

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                res = false;
                break;
            } else {
                res = true;
            }
        }
        return res; // in Case of 1 ,2 & Negative it returns default value 'false'
    }

    public boolean isPrimeDivisorEqualNum(int num) {

        boolean res;
        int divisor;

        for (divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                break;
            }
        }

        if (divisor == num) {
            res = true;
        } else {
            res = false;
        }

        return res;
    }
}
