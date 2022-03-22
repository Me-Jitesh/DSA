import java.util.Scanner;

import number.NRowShape;
import star.SquareShape;

public class LearningDsa {

    public static void main(String[] args) {

        // Print Num Shape
        // printShape();

        // Print Star Shape
        printStarShape();

    }

    static void printStarShape() {
        int num = takeInput();

        // Print Square Star Shape for Given Num
        new SquareShape().printSqrShape(num);
    }

    static void printShape() {

        int num = takeInput();

        // Print Rows for Given Num
        // new NRowShape().printNRowShape(num);

        // Print Square Shape for Given Num
        new NRowShape().printNRowSqrShape(num);
    }

    static int takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        s.close();
        return num;
    }

}