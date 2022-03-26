package array.operation;

import java.util.Arrays;

public class SortZeroOnes {

    public void sortZeroOnesMethod1(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] == 0 && left < right) {
                left++;
            }

            while (arr[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                arr = swap(arr, left, right);
                left++;
                right--;
            }
        }

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    private int[] swap(int[] arr, int num1, int num2) {

        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        return arr;
    }
}
