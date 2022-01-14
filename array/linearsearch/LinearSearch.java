package array.linearsearch;

/**
 * Time Complexity : -
 * Best Case O(1)
 * Average Case O(n)
 * Worst Case O(n)
 */

public class LinearSearch {

    // Return Index
    public int searchInOneDim(int arr[], int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1; // Here We can Return -1 Because array index cannot be negative index
    }

    // Return Value
    public int searchValueInOneDim(int arr[], int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE; // Here We cannot Return -1 Because it may be a value of array
    }

    public int searchCharInString(String words, char letter) {

        for (int i = 0; i < words.length(); i++) {

            if (words.charAt(i) == letter) {
                return i;
            }
        }
        return -1;
    }

}
