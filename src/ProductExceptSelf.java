import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int total = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                total *= nums[i];
            else
                count++;

        }
        if (count > 1) {
            Arrays.fill(nums,0);
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                if (count == 1)
                    res[i] = 0;
                else
                    res[i] = total / nums[i];
            }
            else
                res[i] = total;
        }
        return res;
    }
}
