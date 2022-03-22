package number;

public class SquareShapeNum {

    public void printNRowShape(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    public void numVariation1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + i + " ");
            }
            System.out.print("\n");
        }
    }

    public void numVariation2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.print("\n");
        }
    }

    public void numVariation3(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + (num - j + 1) + " ");
            }
            System.out.print("\n");
        }
    }

    public void numVariation4(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                counter = counter + 1;
                System.out.print(" " + counter + " ");
            }
            System.out.print("\n");
        }
    }
}
