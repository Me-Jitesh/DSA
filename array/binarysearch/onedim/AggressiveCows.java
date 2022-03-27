package array.binarysearch.onedim;

import java.util.Arrays;

//From Code Studio

public class AggressiveCows {

    public void aggressiveCowsMethod1(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int start = 0;
        int max = -1;

        for (int i = 0; i < stalls.length; i++) {
            max = Math.max(max, stalls[i]);
        }

        int end = max;
        int ans = -1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (isPossible(stalls, cows, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        System.out.println("Largest Minimum Distance Is : " + ans);
    }

    private boolean isPossible(int[] stalls, int cows, int mid) {
        int cowCount = 1;
        int lastPos = stalls[0];

        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= mid) {
                cowCount++;
                if (cowCount == cows) {
                    return true;
                }
                lastPos = stalls[i];
            }
        }
        return false;
    }
}
