package Leetcode;

// 1911. Maximum Alternating Subsequence Sum

public class MaximumAlternatingSubsequenceSum {

    public long maxAlternatingSum(int[] nums) {

//        return solveRecursion(nums, 0, 1);

//        long[][] dp = new long[nums.length + 1][2];
//        for (long[] x : dp) {
//            Arrays.fill(x, -1);
//        }
//        return solveRecursionMemoi(nums, 0, 1, dp);

        return solveBottomUp(nums);
    }

    private long solveRecursion(int[] nums, int idx, int isEven) {

        if (idx >= nums.length) {
            return 0;
        }

        long num = nums[idx];

        if (isEven == 0) {
            num = -num;
        }

        long take = num + solveRecursion(nums, idx + 1, isEven == 0 ? 1 : 0);
        long skip = solveRecursion(nums, idx + 1, isEven);

        return Math.max(take, skip);
    }

    private long solveRecursionMemoi(int[] nums, int idx, int isEven, long[][] dp) {

        if (idx >= nums.length) {
            return 0;
        }

        if (dp[idx][isEven] != -1) {
            return dp[idx][isEven];
        }

        long num = nums[idx];

        if (isEven == 0) {
            num = -num;
        }

        long take = num + solveRecursionMemoi(nums, idx + 1, isEven == 0 ? 1 : 0, dp);
        long skip = solveRecursionMemoi(nums, idx + 1, isEven, dp);

        return dp[idx][isEven] = Math.max(take, skip);
    }

    private long solveBottomUp(int[] nums) {

        long[][] t = new long[nums.length + 1][2];
        t[0][1] = 0;
        t[0][0] = 0;

        for (int i = 1; i <= nums.length; i++) { // Even = 1 , Odd = 0
            // Become Even after consider ith value
            long considerToEve = t[i - 1][0] - nums[i - 1];    // nums[i] subtract from odds
            long ignoreToEve = t[i - 1][1];                // return prev even max val

            t[i][1] = Math.max(considerToEve, ignoreToEve); // Store at even array

            // Become Odd after consider ith value
            long considerToOdd = t[i - 1][1] + nums[i - 1];    // nums[i] added to odds
            long ignoreToOdd = t[i - 1][0];                // return prev odd max val

            t[i][0] = Math.max(considerToOdd, ignoreToOdd);  // Store at even array
        }

        return Math.max(t[nums.length][1], t[nums.length][0]);
    }
}
