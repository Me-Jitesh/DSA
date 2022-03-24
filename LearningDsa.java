import java.util.Scanner;

import mathematical.PrimeNumber;

public class LearningDsa {

    public static void main(String[] args) {

        // Given Number is Prime or not
        primeCheck();
    }

    static void primeCheck() {
        int num = takeInput();
        // boolean res = new PrimeNumber().isPrimeNoDivisor(num);
        // boolean res = new PrimeNumber().isPrimeDivisorEqualNum(num);
        boolean res = new PrimeNumber().isPrimeCounter(num);

        if (res) {
            System.out.println("Given Number " + num + " Is : a Prime");
        } else {
            System.err.println("Given Number " + num + " Is : Not a Prime");
        }
    }

    static int takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int num = s.nextInt();
        s.close();
        return num;
    }

}