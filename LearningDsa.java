import java.util.Scanner;

import number.NRowShape;

public class LearningDsa {

    public static void main(String[] args) {

        // Print Num Shape
        printShape();

    }

    static void printShape() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        s.close();

        // Print Rows for Given Num
        // new NRowShape().printNRowShape(num);

        // Print Square Shape for Given Num
        new NRowShape().printNRowSqrShape(num);

    }
}