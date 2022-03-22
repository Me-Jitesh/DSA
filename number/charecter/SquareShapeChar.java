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

    public void charSqrVariation1Opti(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                char val = (char) ('A' + i - 1);
                System.out.print(" " + val + " ");
            }
            System.out.print("\n");
        }
    }

    public void charSqrVariation2(int num) {
        for (int i = 1; i <= num; i++) {
            char val = 'A';
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + val + " ");
                val++;
            }
            System.out.print("\n");
        }
    }

    public void charSqrVariation2Opti(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num; j++) {
                char val = (char) ('A' + j);
                System.out.print(" " + val + " ");
            }
            System.out.print("\n");
        }
    }
}
