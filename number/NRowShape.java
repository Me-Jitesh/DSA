package number;

public class NRowShape {

    public void printNRowShape(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
