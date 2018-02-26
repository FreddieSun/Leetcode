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


}
