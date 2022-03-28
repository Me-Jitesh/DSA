package array.sorting.insertionsort;

import java.util.Arrays;

public class InsertionSortInc {

    public void insertionSortIncMethod1(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println("Sorted Array is : " + Arrays.toString(arr));
    }
}
