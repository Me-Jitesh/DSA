package array;

import java.util.Arrays;

public class Leetcode283 {
    public void moveZeroes(int[] arr) {
        int nonZeroPointer = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                swap(arr, j, nonZeroPointer);
                nonZeroPointer++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private int[] swap(int[] arr, int i, int next) {
        int temp = arr[i];
        arr[i] = arr[next];
        arr[next] = temp;

        return arr;
    }
}