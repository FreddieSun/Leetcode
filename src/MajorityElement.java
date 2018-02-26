import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int res = 0;
        if (nums.length == 1) return nums[0];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for ( int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
                if(map.get(nums[i])>nums.length/2) {
                    res = nums[i];
                    break;
                }
            } else {
                map.put(nums[i] , 1);
            }

        }
        return res;
    }

    // best solution
    public int majorityElement1(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }
}
