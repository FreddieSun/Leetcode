import java.util.HashMap;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                nums[res++] = nums[i];
            }
        }
        return res;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length < 2) return nums.length;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}
