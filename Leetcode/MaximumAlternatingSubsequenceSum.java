package Leetcode;

// 1911. Maximum Alternating Subsequence Sum

import java.util.Arrays;

public class MaximumAlternatingSubsequenceSum {

    public long maxAlternatingSum(int[] nums) {

//        return solveRecursion(nums, 0, 1);

        long[][] dp = new long[nums.length + 1][2];
        for (long[] x : dp) {
            Arrays.fill(x, -1);
        }
        return solveRecursionMemoi(nums, 0, 1, dp);
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
}
