import java.util.HashMap;

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
                if (map.get(nums[i]) > 2) {
                    continue;
                } else {
                    nums[res++] = nums[i];
                }
            } else {
                nums[res++] = nums[i];
                map.put(nums[i],1);
            }
        }
        return res;
    }


    // Key point: this is an sorted array, and at most 2 duplicates.
    // So we can extend our solution to more general situation.

    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }

    // Sorted array, at most k duplicates
    public int removeDuplicates3(int[] nums, int k) {
        int i = 0;

        for (int n: nums) {
            if (i < k || n > nums[k]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
