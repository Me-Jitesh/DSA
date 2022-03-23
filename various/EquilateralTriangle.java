package various;

public class EquilateralTriangle {

    public void equiTriangleVariation1(int num) {
        for (int row = 1; row <= num; row++) {

            int space = num - row;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            int midTriangle = row;
            for (int k = 1; k <= midTriangle; k++) {
                System.out.print(k);
            }

            int backTriangle = row - 1;
            for (int l = 1; l <= backTriangle; l++) {
                int val = row - l;
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
