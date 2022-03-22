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
}
