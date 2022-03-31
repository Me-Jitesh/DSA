package array;

public class CheckSortedOrNot {

    public boolean isSorted(int[] arr, int startIndex) {

        if (startIndex == arr.length - 1) {
            return true;
        }

        if (arr[startIndex] > arr[startIndex + 1]) {
            return false;
        }

        return isSorted(arr, startIndex + 1);
    }
}
