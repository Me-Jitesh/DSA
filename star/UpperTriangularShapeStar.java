package star;

public class UpperTriangularShapeStar {

    public void starUpTriVariation1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
