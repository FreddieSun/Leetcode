public class CanJump {
    public boolean canJump(int[] nums) {
        if (nums.length == 0 || nums == null)
            return false;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max)
                return false;
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }

    //backtracking
    public boolean canJump1(int[] nums) {
        int n = nums.length - 1;
        int last = n;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] + i >= last)
                last =i;
        }
        return last <= 0;
    }
}
