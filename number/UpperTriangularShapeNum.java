package number;

public class UpperTriangularShapeNum {

    public void numUpTriVariation1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    public void numUpTriVariation2(int num) {

        int counter = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                counter = counter + 1;
                System.out.print(counter);
            }
            System.out.print("\n");
        }
    }

    public void numUpTriVariation3(int num) {

        for (int i = 1; i <= num; i++) {

            int row = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(row);
                row = row + 1;
            }
            System.out.print("\n");
        }
    }

    public void numUpTriVariation3Opti(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(i + j);
            }
            System.out.print("\n");
        }
    }

    public void numUpTriVariation3Opti2(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                int val = i + j - 1;
                System.out.print(val);
            }
            System.out.print("\n");
        }
    }
}
