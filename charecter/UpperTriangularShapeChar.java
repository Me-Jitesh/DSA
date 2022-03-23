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

}
