package array.binarysearch.twodim;

public class RowColSortedMatrix {

    public int[] searchFor(int[][] matrix, int target) {

        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }

}
