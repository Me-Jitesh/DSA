package array;

public class Leetcode1752 {
    public void checkArrayIsSortednRotated(int arr[]) {
        boolean isSortnRot = false;
        int count = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                count++;
            }
            if (arr[n - 1] > arr[0]) {
                count++;
            }
        }
        if (count <= 1) {
            isSortnRot = true;
        }
        System.out.println("isArraySortednRotated : " + isSortnRot);
    }
}