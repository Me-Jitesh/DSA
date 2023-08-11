package Leetcode;

import java.util.Arrays;

// 198. House Robber

public class HouseRobber {

    public int rob(int[] nums) {
        int dp[] = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return solveMemoi(nums, 0, dp);
    }

    private int solveRecursion(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }

        int steal = nums[i] + solveRecursion(nums, i + 2);
        int skip = solveRecursion(nums, i + 1);

        return Math.max(steal, skip);
    }

    private int solveMemoi(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int steal = nums[i] + solveMemoi(nums, i + 2, dp);
        int skip = solveMemoi(nums, i + 1, dp);

        return dp[i] = Math.max(steal, skip);
    }

    private int solveBottomUp(int[] nums) {
        int[] t = new int[nums.length + 1];

        t[0] = 0;
        t[1] = nums[0];

        for (int i = 2; i <= nums.length; i++) {
            int steal = nums[i - 1] + t[i - 2];
            int skip = t[i - 1];

            // t[i] = maximum stolen money till i house
            t[i] = Math.max(steal, skip);
        }
        return t[nums.length];
    }
}
