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
}
