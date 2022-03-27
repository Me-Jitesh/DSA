import java.util.Scanner;

import array.Leetcode852;
import bitmanipulation.Leetcode1009;
import bitmanipulation.Leetcode191;
import digits.Leetcode1281;
import digits.Leetcode7;
import maths.Leetcode231;

public class LearningDsa {

    public static void main(String[] args) {
        // int num = takeInput();

        // printLc1281(num);

        // printLc191(num);

        // printLc7(num);

        // printLc1009(num);

        // printLc231(num);

        printLc852();

    }

    static void printLc852() {
        int[] arr = { 24, 69, 100, 109, 19, 178, 67, 36, 24, 19 };
        new Leetcode852().peekIndexInMountainArray(arr);
    }

    static void printLc231(int num) {
        // boolean res = new Leetcode231().powerOf2(num);
        // boolean res = new Leetcode231().powerOf2Opti(num);
        boolean res = new Leetcode231().powerOf2Opti2(num);
        if (res) {
            System.out.println("Yes ! It Is Power Of 2 ");
        } else {
            System.out.println("Nope ! It Is Not Power Of 2 ");
        }
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