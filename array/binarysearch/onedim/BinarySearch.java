package array.binarysearch.onedim;

public class BinarySearch {

    // Return Index
    public int searchInOneDimAsc(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans Found
                return mid;
            }
        }
        return -1;
    }
}
