package array.operation;

import java.util.Arrays;

public class Merge2SortedArray {

    public void merge2SortedArrayMethod1(int[] arr1, int[] arr2) {

        int mergeArrSize = arr1.length + arr2.length;
        int[] mergedArr = new int[mergeArrSize];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k] = arr1[i];
                k++;
                i++;
            } else {
                mergedArr[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < arr1.length) {
            mergedArr[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            mergedArr[k] = arr2[j];
            k++;
            j++;
        }
        System.out.println("Merged Array : " + Arrays.toString(mergedArr));
    }
}
