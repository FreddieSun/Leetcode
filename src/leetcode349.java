import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res=new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            if(i+1!= nums1.length)
                if(i+1<nums1.length&&nums1[i]==nums1[i+1])
                    continue;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    res.add(nums1[i]);
                    break;
                }
            }
        }
        int[] result=new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;


    }

    public static void main(String[] args) {
        int[] num2={1,2};
        int[] num1={1,1};

        int[] res=intersection(num1,num2);

        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);


    }



}
