package charecter;

public class UpperTriangularShapeChar {

    public void charUpTriVariation1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {

                char val = (char) ('A' + i - 1);

                System.out.print(" " + val + " ");
            }
            System.out.print("\n");
        }
    }

    public void charUpTriVariation2(int num) {
        char val = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + val + " ");
                val++;
            }
            System.out.print("\n");
        }
    }

    public void charUpTriVariation3(int num) {
        for (int i = 1; i <= num; i++) {
            char val = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + val + " ");
                val++;
            }
            System.out.print("\n");
        }
    }

    public void charUpTriVariation4(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                char val = (char) ('A' + i + j - 2);
                System.out.print(" " + val + " ");
            }
            System.out.print("\n");
        }
    }

}
