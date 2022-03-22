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

    public void numSqrVariation1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + i + " ");
            }
            System.out.print("\n");
        }
    }

    public void numSqrVariation2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.print("\n");
        }
    }

    public void numSqrVariation3(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + (num - j + 1) + " ");
            }
            System.out.print("\n");
        }
    }

    public void numSqrVariation4(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                counter = counter + 1;
                System.out.print(" " + counter + " ");
            }
            System.out.print("\n");
        }
    }

    public void numSqrVariation5(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                int val = i + j - 1;
                System.out.print(" " + val + " ");
            }
            System.out.print("\n");
        }
    }
}
