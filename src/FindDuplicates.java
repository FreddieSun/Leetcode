import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        if(nums.length==0)
            return temp;
        else{
            for(int i=0;i<nums.length;i++){
                int location=Math.abs(nums[i])-1;
                if(nums[location]<0)
                    temp.add(Math.abs(nums[i]));
                nums[location]=-nums[location];
            }
        }
        return temp;
    }
}
