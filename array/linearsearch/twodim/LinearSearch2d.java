package array.linearsearch.twodim;

public class LinearSearch2d {

    // Return Index
    public int[] searchInTwoDim(int arr[][], int num) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == num) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 }; // Here We can Return -1 Because array index cannot be negative index
    }

    public int findMaxVal2d(int arr[][]) {
        int currentMax = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > currentMax) {
                    currentMax = arr[row][col];
                }
            }
        }
        return currentMax;
    }
}