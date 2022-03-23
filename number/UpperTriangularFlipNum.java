package number;

public class UpperTriangularFlipNum {

    public void numUpTriFlipVariation1(int num) {
        for (int i = 1; i <= num; i++) {

            int space = num - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            int star = i;
            for (int k = 1; k <= star; k++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
