package mathematical;

public class FindnCr {

    public void nCrMethod1(int n, int r) {

        int numer = fact(n);
        int denom = fact(r) * fact(n - r);

        int nCr = numer / denom;

        System.out.println("nCr Value is : " + nCr);
    }

    private int fact(int num) {
        int factNum = 1;

        for (int i = 1; i <= num; i++) {
            factNum = factNum * i;
        }
        return factNum;
    }
}
