import mathematical.Factorial;
import mathematical.PowerOf2;
import mathematical.PrintNum;

public class LearningDsa {

    public static void main(String[] args) {
        // printFactorial();
        // printPowerOf2();
        printNum();
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