import java.util.Scanner;

import number.SquareShapeNum;
import star.SquareShapeStar;
import star.UpperTriangularShapeStar;

public class LearningDsa {

    public static void main(String[] args) {

        // Print Square Num Shape
        // printNumShape();

        // Print Square Star Shape
        // printStarShape();

        // Print Triangular Star Shape
        printStarUpTriangularShape();
    }

    static void printStarUpTriangularShape() {
        int num = takeInput();
        new UpperTriangularShapeStar().starUpTriVariation1(num);
    }

    static void printStarShape() {
        int num = takeInput();

        // Print Square Star Shape for Given Num
        new SquareShapeStar().starSqrVariation1(num);
    }

    static void printNumShape() {

        int num = takeInput();

        // Print Rows for Given Num
        // new SquareShapeNum().printNRowShape(num);

        // Print Square Shape for Given Num
        // new SquareShapeNum().numSqrVariation1(num);
        // new SquareShapeNum().numSqrVariation2(num);
        // new SquareShapeNum().numSqrVariation3(num);
        new SquareShapeNum().numSqrVariation4(num);
    }

    static int takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        s.close();
        return num;
    }

}