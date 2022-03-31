package mathematical;

public class PrintNum {
    public void printNumTailRecursion(int n) {

        // Base Case
        if (n == 0) {
            return;
        }

        // Processing
        System.out.println(n);

        // Recursive Relation
        printNumTailRecursion(n - 1);
    }

    public void printNumHeadRecursion(int n) {

        // Base Case
        if (n == 0) {
            return;
        }

        // Recursive Relation
        printNumHeadRecursion(n - 1);

        // Processing
        System.out.println(n);
    }
}
