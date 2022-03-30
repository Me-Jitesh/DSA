package array.twodimarray;

import java.util.ArrayList;

//From code Basics
public class PrintLikeWave {

    public void printLikeAWave(int[][] arr, int nRows, int nCols) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int col = 0; col < nCols; col++) {

            if ((col & 1) == 1) { // odd =Bottom to Top
                for (int row = nRows - 1; row >= 0; row--) {
                    arrayList.add(arr[row][col]);
                }
            } else {// 0 or even=Top to Bottom
                for (int row = 0; row < nRows; row++) {
                    arrayList.add(arr[row][col]);
                }
            }
        }
        System.out.println(arrayList.toString());
    }
}
