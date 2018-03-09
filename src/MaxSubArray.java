public class MaxSubArray {
    // dp
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if (nums == null || nums.length == 0)
            return res;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i-1] < 0 ? 0 : dp[i - 1]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    // same idea with dp but without dp.
    // take care of the negative value
    public int maxSubArray1(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(sum < 0)
                sum = nums[i];
            else
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }

    // same with the above
    public int maxSubArray2(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], maxEndingHere);
            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        return maxSoFar;
    }
}
