import java.util.Scanner;

import number.SquareShapeNum;
import star.SquareShapeStar;

public class LearningDsa {

    public static void main(String[] args) {

        // Print Num Shape
        printNumShape();

        // Print Star Shape
        // printStarShape();3

    }

    static void printStarShape() {
        int num = takeInput();

        // Print Square Star Shape for Given Num
        new SquareShapeStar().starVariation1(num);
    }

    static void printNumShape() {

        int num = takeInput();

        // Print Rows for Given Num
        // new SquareShapeNum().printNRowShape(num);

        // Print Square Shape for Given Num
        // new SquareShapeNum().numVariation1(num);
        // new SquareShapeNum().numVariation2(num);
        new SquareShapeNum().numVariation3(num);
    }

    static int takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        s.close();
        return num;
    }

}