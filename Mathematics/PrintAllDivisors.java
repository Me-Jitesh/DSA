package Mathematics;

public class PrintAllDivisors {
    public static void printAllDivisors(int num) {
        int counter = 1;
        int sqroot = (int) Math.sqrt(num);
        while (counter <= sqroot) {
            if (num % counter == 0) {
                System.out.println(counter + " is a divisor of " + num);
                int otherNumber = num / counter;
                if (otherNumber != counter)
                    System.out.println(otherNumber + " is a divisor of " + num);
            }
            counter++;
        }
    }
}
