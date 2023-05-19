package Mathematics;

public class PrimeNumber {

    public static void primeNumbers(int num) {
        int counter = 2;
        int sqroot = (int) Math.sqrt(num);
        while (counter <= sqroot) {
            if (num % counter == 0) {
                System.out.println(num + " is not a prime number ");
                return;
            }
            counter++;
        }
        System.out.println(num + " is a prime number ");
    }
}
