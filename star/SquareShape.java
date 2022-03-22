package star;

public class SquareShape {

    public void printSqrShape(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
