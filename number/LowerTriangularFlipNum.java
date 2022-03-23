package number;

public class LowerTriangularFlipNum {

    public void numLowTriVariation1(int num) {
        for (int i = 1; i <= num; i++) {

            int space = i - 1;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            int star = num - i + 1;
            for (int j = 1; j <= star; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
