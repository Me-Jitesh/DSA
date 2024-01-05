package Leetcode;

public class FindSmallestLetterGreaterThenTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        return findCeiling(letters, target);
    }

    char findCeiling(char[] arr, char target) {
        char ans = '$';
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = arr[mid];
            }
        }

        if (ans == '$') {
            return arr[0];
        } else {
            return ans;
        }
    }
}
