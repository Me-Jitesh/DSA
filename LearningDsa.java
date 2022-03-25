import java.util.Scanner;

import bitmanipulation.Leetcode1009;
import bitmanipulation.Leetcode191;
import digits.Leetcode1281;
import digits.Leetcode7;

public class LearningDsa {

    public static void main(String[] args) {
        int num = takeInput();

        // printLc1281(num);

        // printLc191(num);

        // printLc7(num);

        printLc1009(num);

    }

    static void printLc1009(int num) {
        int res = new Leetcode1009().ComplementBase10Integer(num);
        System.out.println("Complement of Given Integer : " + res);
    }

    static void printLc7(int num) {
        int res = new Leetcode7().reverseInteger(num);

        if (res == 0) {
            System.out.println("Answer is Out Of Integer Range !! ");
        } else {
            System.out.println("Reverse of given no is : " + res);
        }
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