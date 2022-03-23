package star;

public class UpperTriangularFlipStar {

    public void starUpTriFlipVariation1(int num) {
        for (int i = 1; i <= num; i++) {

            int space = num - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            int star = i;
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
