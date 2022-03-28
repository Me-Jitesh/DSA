package array.sorting.selectionsort;

import java.util.Arrays;

public class SelectionSortInc {

    public void selectionSortIncMethod1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
        System.out.println("Sorted Array is : " + Arrays.toString(arr));
    }

    private int[] swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        return arr;
    }
}
