package array.binarysearch.onedim;

public class OrderAgnosticBinSearch {

    public int searchFor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // Check Whether Ascending Or Descending
        boolean isAsc = arr[0] < arr[arr.length - 1];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
