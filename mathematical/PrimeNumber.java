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

    //  Higher Time Complexity in Case Of Not Prime In Comaprison to Previous Method(isPrimeDivisorEqualNum)
    public boolean isPrimeCounter(int num) {

        boolean res;
        int counter = 0;

        for (int divisor = 1; divisor <= num; divisor++) {
            if (num % divisor == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            res = true;
        } else {
            res = false;
        }

        return res;
    }
}
