import java.util.Scanner;

import mathematical.FibonacciNumber;
import mathematical.FindGCD;
import mathematical.FindPower;
import mathematical.FindnCr;
import mathematical.PrimeNumber;
import mathematical.SumOfN;
import numbersystem.BinaryToDecimalConversion;
import numbersystem.DecimalToBinaryConversion;

public class LearningDsa {

    public static void main(String[] args) {

        // int num = takeInput();
        // Given Number is Prime or not
        // printPrimeCheck(num);

        // Find Fibonocci
        // printFibNum(num);

        // Sum From 1 to n
        // printSumOfN(num);

        // Converting Decimal into Binary
        // printDecToBin(num);

        // Converting Binary into Decimal
        // printBinToDec(num);

        // printFindPow();

        // prinFindnCr();

        printFindGcd();

    }

    static void printFindGcd() {
        int a = 24;
        int b = 72;
        int res = new FindGCD().findGcd(a, b);
        System.out.println("GCD of Given Numbesr is : " + res);
    }

    static void prinFindnCr() {
        int n = 13;
        int r = 0;

        new FindnCr().nCrMethod1(n, r);
    }

    static void printFindPow() {
        int base = 2;
        int expo = 8;

        new FindPower().findPowerMetod1(base, expo);
    }

    static void printBinToDec(int num) {
        new BinaryToDecimalConversion().binaryToDecimalMethod1(num);
    }

    static void printDecToBin(int num) {
        new DecimalToBinaryConversion().decimalToBinaryMethod1(num);
    }

    static void printSumOfN(int num) {
        new SumOfN().sumOfNMetod1(num);
    }

    static void printFibNum(int num) {
        new FibonacciNumber().fibNumMethod1(num);
    }

    static void printPrimeCheck(int num) {
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