package array.binarysearch.onedim;

//From code Studio
public class SearchInRotatedSortedArray {

    public void SearchInRotatedSortedArrayMethed1(int[] arr, int target) {
        int ans;

        int pivot = findPivot(arr);

        if (target >= arr[pivot] && target <= arr[arr.length - 1]) {
            ans = binarySearch(arr, pivot, arr.length - 1, target);
        } else {
            ans = binarySearch(arr, 0, pivot - 1, target);
        }

        System.out.println("Given Num is present at : " + ans);
    }

    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {

            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        return start;
    }

    public int binarySearch(int[] arr, int start, int end, int target) {

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