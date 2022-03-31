import mathematical.Factorial;

public class LearningDsa {

    public static void main(String[] args) {
        printFactorial();
    }

    static void printFactorial() {
        int n = 5;
        int fact = new Factorial().findFact(n);
        System.out.println("Factorial Of Num " + n + " is : " + fact);
    }
}