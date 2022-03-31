import array.CheckSortedOrNot;
import cp.CountWaysToReachNthStairs;
import cp.PronounceDigit;
import mathematical.Factorial;
import mathematical.PowerOf2;
import mathematical.PrintNum;

public class LearningDsa {

    public static void main(String[] args) {
        // printFactorial();
        // printPowerOf2();
        // printNum();
        // printCountWaysToReachNthStairs();
        // printPronounceDigit();
        printCheckSortedOrNot();
    }

    static void printCheckSortedOrNot() {
        int[] arr = { 1, 2, 2, 3, 5, 7, 9, 10, 15, 20 };
        // int[] arr = { 1, 2, 2, 3, 5, 7, 9, 18, 10, 15, 20 };
        int startIndex = 0;
        boolean res = new CheckSortedOrNot().isSorted(arr, startIndex);
        if (res) {
            System.out.println("Yess it is Sorted : " + res);
        } else {
            System.out.println("Nope it is not  Sorted : " + res);
        }
    }

    static void printPronounceDigit() {
        int num = 102394;
        String[] pronounciations = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        new PronounceDigit().pronounceDigit(num, pronounciations);
    }

    static void printCountWaysToReachNthStairs() {
        int nStairs = 3;
        int count = new CountWaysToReachNthStairs().countDistinctWayToClimbStair(nStairs);
        System.out.println("Count of Distinct Way To Climb Stair : " + count);
    }

    static void printNum() {
        int n = 5;

        System.out.println("Tail Recursion : ");
        new PrintNum().printNumTailRecursion(n);

        System.out.println("Head Recursion : ");
        new PrintNum().printNumHeadRecursion(n);
    }

    static void printFactorial() {
        int n = 5;
        int fact = new Factorial().findFact(n);
        System.out.println("Factorial Of Num " + n + " is : " + fact);
    }

    static void printPowerOf2() {
        int n = 5;
        int pow = new PowerOf2().findPow2(n);
        System.out.println("Value Of 2 ^ " + n + " is : " + pow);
    }
}