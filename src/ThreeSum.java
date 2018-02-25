import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Map<Integer,int[]> map=new HashMap<Integer,int[]>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            map.clear();
            if(i==0||nums[i-1]<nums[i]){
                for(int j=i+1;j<nums.length;j++){
                    if(map.containsKey(nums[j])){
                        int[] temp=map.get(nums[j]);
                        res.add(Arrays.asList(temp[0],temp[1],nums[j]));
                        while(j<nums.length-1&&nums[j]==nums[j+1])
                            j++;
                    }else{
                        map.put(-nums[i]-nums[j],new int[]{nums[i],nums[j]});
                    }
                }
            }

        }
        return res;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int N=nums.length;

        for(int i=0;i<N-2;i++){
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int a=nums[i];
            int left=i+1;
            int right=N-1;
            while(left<right){
                int b=nums[left];
                int c=nums[right];
                if(a+b+c<0){
                    while(left < right && nums[left+1] == nums[left]) left ++;
                    left++;
                }
                else if(a+b+c>0){
                    while(left < right && nums[right-1] == nums[right]) right--;
                    right--;
                }else{
                    res.add(Arrays.asList(a,b,c));
                    while(left < right && nums[right-1] == nums[right]) right--;

                    right--;
                    left++;
                }

            }
        }

        return res;
    }
}
