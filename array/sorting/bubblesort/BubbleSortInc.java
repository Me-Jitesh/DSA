package array.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSortInc {

    public void bubbleSortIncMethod1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("Sorted Array is : " + Arrays.toString(arr));
    }

    public void bubbleSortIncMethod1Opti(int[] arr) {

        // for (int i = 0; i < arr.length - 1; i++) {
        for (int i = 1; i < arr.length; i++) {

            // for (int j = 0; j < (arr.length - i - 1); j++) {
            for (int j = 0; j < (arr.length - i); j++) {

                // System.out.print(j); // For Debugging purpose only

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
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