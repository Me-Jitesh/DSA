package Leetcode;

// 213. House Robber II
public class HouseRobber2 {

    public int rob(int[] nums) {

//        int n = nums.length;
//        if (n == 1) {
//            return nums[0];

//        int take0thIdxHouse = solveRecursion(nums, 0, n - 2);
//        int take1stIdxHouse = solveRecursion(nums, 1, n - 1);
//        return Math.max(take0thIdxHouse, take1stIdxHouse);

//        int[] dp = new int[n + 1];
//        Arrays.fill(dp, -1);
//        int take0thIdxHouse = solveRecursionMemoi(nums, 0, n - 2, dp);
//        Arrays.fill(dp, -1);
//        int take1stIdxHouse = solveRecursionMemoi(nums, 1, n - 1, dp);
//        return Math.max(take0thIdxHouse, take1stIdxHouse);

//        return solveBottomUp(nums);

//        // Case 1 -  take first house, so skip the last house
//        int steal0thIdxHouse = solveBottomUpDryPrinciple(nums, 1, nums.length - 1);
//        // Case 2 -  skip first house, so take the last house
//        int skip0thIdxHouse = solveBottomUpDryPrinciple(nums, 2, nums.length);
//
//        return Math.max(steal0thIdxHouse, skip0thIdxHouse);

        // Case 1 -  take first house, so skip the last house
        int steal0thIdxHouse = solveBottomUpConstSpace(nums, 1, nums.length - 1);
        // Case 2 -  skip first house, so take the last house
        int skip0thIdxHouse = solveBottomUpConstSpace(nums, 2, nums.length);

        return Math.max(steal0thIdxHouse, skip0thIdxHouse);
    }

    private int solveRecursion(int[] nums, int i, int n) {

        if (i > n) {
            return 0;
        }

        int steal = nums[i] + solveRecursion(nums, i + 2, n);
        int skip = solveRecursion(nums, i + 1, n);

        return Math.max(steal, skip);
    }

    private int solveRecursionMemoi(int[] nums, int i, int n, int[] dp) {

        if (i > n) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int steal = nums[i] + solveRecursionMemoi(nums, i + 2, n, dp);
        int skip = solveRecursionMemoi(nums, i + 1, n, dp);

        return dp[i] = Math.max(steal, skip);
    }

    private int solveBottomUp(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int[] t = new int[nums.length + 1];

        // Case 1 -  take first house, so skip the last house
        t[0] = 0;
        for (int i = 1; i <= nums.length - 1; i++) {
            int steal = nums[i - 1] + t[i - 2 >= 0 ? i - 2 : 0];
            int skip = t[i - 1];
            //t[i] = max stolen money when we have i houses only
            t[i] = Math.max(steal, skip);
        }
        int steal0thIdxHouse = t[nums.length - 1];

        // Case 1 -  skip first house, so take the last house
        t[0] = 0;
        t[1] = 0;
        for (int i = 2; i <= nums.length; i++) {
            int steal = nums[i - 1] + t[i - 2 >= 0 ? i - 2 : 0];
            int skip = t[i - 1];
            t[i] = Math.max(steal, skip);
        }
        int skip0thIdxHouse = t[nums.length];

        return Math.max(steal0thIdxHouse, skip0thIdxHouse);

    }

    private int solveBottomUpDryPrinciple(int[] nums, int s, int e) {

        int t[] = new int[nums.length + 1];

        t[0] = 0;
        t[1] = 0;

        for (int i = s; i <= e; i++) {
            int steal = nums[i - 1] + t[i - 2 >= 0 ? i - 2 : 0];
            int skip = t[i - 1];
            //t[i] = max stolen money when we have i houses only
            t[i] = Math.max(steal, skip);
        }
        return t[e];
    }

    private int solveBottomUpConstSpace(int[] nums, int s, int e) {

        int prevOfprev = 0;
        int prev = 0;

        for (int i = s; i <= e; i++) {
            int steal = nums[i - 1] + prevOfprev;
            int skip = prev;
            //temp = max stolen money when we have i houses only
            int temp = Math.max(steal, skip);
            prevOfprev = prev;
            prev = temp;
        }
        return prev;
    }
}

