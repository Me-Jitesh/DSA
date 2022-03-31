package mathematical;

public class Factorial {

    // Base Case
    public int findFact(int n) {
        if (n == 0) {
            return 1;
        }

        // Recursive Relation
        int smallProblem = findFact(n - 1);
        int biggerProblem = n * smallProblem;

        return biggerProblem;
        // return n * findFact(n - 1); //Optimized
    }
}
