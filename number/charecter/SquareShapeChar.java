package number.charecter;

public class SquareShapeChar {

    public void charSqrVariation1(int num) {
        char val = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + val + " ");
            }
            val++;
            System.out.print("\n");
        }
    }
}
