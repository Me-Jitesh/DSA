package array.operation;

import java.util.Arrays;

//From Code Studio

public class PairSum {

    public void pairSumMethod1(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {

                    // for sorting
                    int[] val = { Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j]) };

                    // sorting Array Overall
                    Arrays.sort(val);

                    System.out.println("Sum Of " + Arrays.toString(val) + " is = " + sum);
                }
            }
        }
    }
}
