package mathematical;

public class PowerOf2 {
    public int findPow2(int expo) {

        if (expo == 0) {
            return 1;
        }

        return 2 * findPow2(expo - 1);
    }
}
