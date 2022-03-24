import java.util.Scanner;

import bitmanipulation.Leetcode191;
import digits.Leetcode1281;

public class LearningDsa {

    public static void main(String[] args) {
        int num = takeInput();

        // printLc1281(num);

        printLc191(num);
    }

    static void printLc191(int num) {
        new Leetcode191().numberOfOneBits(num);
    }

    static void printLc1281(int num) {
        new Leetcode1281().subtractProductAndSum(num);
    }

    static int takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int num = s.nextInt();
        s.close();
        return num;
    }
}