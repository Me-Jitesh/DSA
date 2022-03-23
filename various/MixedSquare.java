package various;

public class MixedSquare {
    public void mixedElmVariation1(int num) {
        for (int row = 1; row <= num; row++) {

            int leftTriangle = num - row + 1;
            for (int j = 1; j <= leftTriangle; j++) {
                System.out.print(j);
            }

            int midStar = 2 * (row - 1);
            for (int k = 1; k <= midStar; k++) {
                System.out.print("*");
            }

            int rightTriangle = num - row + 1;
            // int val = num - row + 1;                         // Formula 1
            for (int l = 1; l <= rightTriangle; l++) {
                int val = num - row - l + 2;                    // Formula 2
                System.out.print(val);
                val--;
            }
            System.out.print("\n");
        }
    }
}
