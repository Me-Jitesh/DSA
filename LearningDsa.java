import java.util.Scanner;

import charecter.SquareShapeChar;
import charecter.UpperTriangularShapeChar;
import number.SquareShapeNum;
import number.UpperTriangularShapeNum;
import star.SquareShapeStar;
import star.UpperTriangularShapeStar;

public class LearningDsa {

    public static void main(String[] args) {

        // Print Square Num Shape
        // printNumShape();

        // Print Square Star Shape
        // printStarShape();

        // Print Triangular Star Shape
        // printStarUpTriangularShape();

        // Print Triangular Star Shape
        // printNumUpTriangularShape();

        // Print Square Char Shape
        // printCharSquareShape();

        // Print Triangular Char Shape
        printCharUpTriangularShape();
    }

    static void printCharUpTriangularShape() {
        int num = takeInput();
        // new UpperTriangularShapeChar().charUpTriVariation1(num);
        // new UpperTriangularShapeChar().charUpTriVariation2(num);
        // new UpperTriangularShapeChar().charUpTriVariation3(num);
        // new UpperTriangularShapeChar().charUpTriVariation4(num);
        new UpperTriangularShapeChar().charUpTriVariation5(num);

    }

    static void printCharSquareShape() {
        int num = takeInput();
        // new SquareShapeChar().charSqrVariation1(num);
        // new SquareShapeChar().charSqrVariation1Opti(num);
        // new SquareShapeChar().charSqrVariation2(num);
        // new SquareShapeChar().charSqrVariation2Opti(num);
        // new SquareShapeChar().charSqrVariation2Opti2(num);
        // new SquareShapeChar().charSqrVariation3(num);
        // new SquareShapeChar().charSqrVariation3Opti(num);
        new SquareShapeChar().charSqrVariation4(num);
    }

    static void printNumUpTriangularShape() {
        int num = takeInput();
        // new UpperTriangularShapeNum().numUpTriVariation1(num);
        // new UpperTriangularShapeNum().numUpTriVariation2(num);
        // new UpperTriangularShapeNum().numUpTriVariation3(num);
        // new UpperTriangularShapeNum().numUpTriVariation3Opti(num);
        // new UpperTriangularShapeNum().numUpTriVariation3Opti2(num);
        new UpperTriangularShapeNum().numUpTriVariation4(num);
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
        // new SquareShapeNum().numSqrVariation4(num);
        new SquareShapeNum().numSqrVariation5(num);
    }

    static int takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        s.close();
        return num;
    }

}