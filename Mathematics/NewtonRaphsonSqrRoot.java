package Mathematics;

public class NewtonRaphsonSqrRoot {

    public static void newtonRaphsonSqRoot(int num) {
        double tol = 0.0001;
        double root;
        double X = num;
        while (true) {
            root = 0.5 * (X + (num / X));
            double ans = X - root;
            if (ans < tol) {
                break;
            }
            X = root;
        }
        System.out.println("Square root of  " + num + " is : " + root);
    }
}
