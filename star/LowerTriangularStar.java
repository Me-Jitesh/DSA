package star;

public class LowerTriangularStar {

    public void starLowTriVariation1(int num) {
        for (int i = 1; i <= num; i++) {

            int freq = num - i + 1;
            for (int j = 1; j <= freq; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
