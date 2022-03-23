package charecter;

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

    public void charSqrVariation2Opti2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                char val = (char) ('A' + j - 1);
                System.out.print(" " + val + " ");
            }
            System.out.print("\n");
        }
    }

    public void charSqrVariation3(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                char val = (char) ('A' + counter);
                System.out.print(" " + val + " ");
                counter++;
            }
            System.out.print("\n");
        }
    }

    public void charSqrVariation3Opti(int num) {
        char val = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + val + " ");
                val++;
            }
            System.out.print("\n");
        }
    }

    public void charSqrVariation4(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                // char val = (char) ('A' + (i + j - 2));
                char val = (char) ('A' + i + j - 2);
                System.out.print(" " + val + " ");
            }
            System.out.print("\n");
        }
    }

    public void charSqrVariation4Opti(int num) {
        for (int i = 1; i <= num; i++) {
            char val = (char) ('A' + i - 1);
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + val + " ");
                val++;
            }
            System.out.print("\n");
        }
    }
}
