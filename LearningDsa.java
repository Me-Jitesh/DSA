import java.util.Scanner;

import mathematical.FibonacciNumber;
import mathematical.PrimeNumber;
import mathematical.SumOfN;

public class LearningDsa {

    public static void main(String[] args) {

        // Given Number is Prime or not
        // printPrimeCheck();

        // Find Fibonocci
        // printFibNum();

        // Sum From 1 to n
        printSumOfN();
    }

    private static void printSumOfN() {
        int num = takeInput();
        new SumOfN().sumOfNMetod1(num);
    }

    static void printFibNum() {
        int num = takeInput();
        new FibonacciNumber().fibNumMethod1(num);
    }

    static void printPrimeCheck() {
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