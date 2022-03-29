package array;

import java.util.Arrays;

public class Leetcode189 {

    public void rotateArrayMethod1(int arr[], int key) {

        int[] roteted = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            roteted[(i + key) % arr.length] = arr[i];
        }
        System.out.println("Rotated Array " + Arrays.toString(roteted));
    }
}