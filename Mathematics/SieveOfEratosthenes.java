package Mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void sieveAlgorithm(int num) {
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        int counter = 2;
        while (counter <= num) {
            if (arr[counter] == true) {
                for (int factor = counter + counter; factor <= num; factor += counter) {
                    arr[factor] = false;
                }
            }
            counter++;
        }

        for (int i = 2; i <= num; i++) {
            System.out.println(i + " : " + arr[i]);
        }
    }
}
