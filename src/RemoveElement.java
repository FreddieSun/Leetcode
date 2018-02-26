import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int index = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                res++;
                nums[index++] = nums[i];
            }
        }
        return res;
    }
}
