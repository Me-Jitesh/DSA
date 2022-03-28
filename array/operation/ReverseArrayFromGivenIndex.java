package array.operation;

import java.util.Arrays;

//From Code Basics
public class ReverseArrayFromGivenIndex {

    public void reverseArrayFromGivenIndexMethod1(int arr[], int index) {

        int start = index + 1;
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