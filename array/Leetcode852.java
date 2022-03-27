package array;

public class Leetcode852 {

    public void peekIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        System.out.println("Peak Present at Index : " + start);
    }

}
