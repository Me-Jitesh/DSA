package array.linearsearch;

/**
 * Time Complexity : -
 * Best Case O(1)
 * Average Case O(n)
 * Worst Case O(n)
 */

public class LinearSearch {

    public int searchInOneDim(int arr[], int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
