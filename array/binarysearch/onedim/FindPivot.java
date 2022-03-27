package array.binarysearch.onedim;

public class FindPivot {

    public void findPivotMethod1(int[] arr) {
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
        System.out.println("Pivot Present at Index : " + start); // end is also point Pivot
    }
}
