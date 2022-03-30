package array;

import java.util.ArrayList;

public class Leetcode54 {

    public void spiralMatrix(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        int total = row * col;

        // indexes
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;

        ArrayList<Integer> ans = new ArrayList<>();
        while (count < total) {

            // print starting row
            for (int index = startingCol; count < total && index <= endingCol; index++) {
                ans.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;

            // print ending col
            for (int index = startingRow; count < total && index <= endingRow; index++) {
                ans.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;

            // print ending row
            for (int index = endingCol; count < total && index >= startingCol; index--) {
                ans.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;

            // print starting col
            for (int index = endingRow; count < total && index >= startingRow; index--) {
                ans.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        System.out.println(ans.toString());
    }
}
