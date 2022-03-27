package array.binarysearch.onedim;

//From Code Studio
public class FirstAndLastPositionOfElem {

    public void firstAndLastPositionOfElemMetheod1(int[] arr, int target) {

        System.out.println("First Occurence of Given Num is : " + firstOccurence(arr, target));
        System.out.println("Last Occurence of Given Num is : " + lastOccurence(arr, target));

        int total = lastOccurence(arr, target) - firstOccurence(arr, target) + 1;
        System.out.println("Total Number of Occurence : " + total);

    }

    public int firstOccurence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while (start <= end) {

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public int lastOccurence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while (start <= end) {

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
}
