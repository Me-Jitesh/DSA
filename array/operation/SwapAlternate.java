package array.operation;

import java.util.Arrays;

public class SwapAlternate {

    public void swapAlternateMethod1(int[] arr) {

        for (int i = 0; i < arr.length; i += 2) {
            if (i < (arr.length - 1)) {
                arr = swap(arr, i, i + 1);
            }
        }

        System.out.println("Swaping Done :" + Arrays.toString(arr));
    }

    private int[] swap(int[] arr, int i, int next) {
        int temp = arr[i];
        arr[i] = arr[next];
        arr[next] = temp;

        return arr;
    }
}
