package array.operation;

import java.util.Arrays;

public class ReverseArray {

    public void reverseArrayMethod1(int arr[]) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            arr = swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    private int[] swap(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }
}
