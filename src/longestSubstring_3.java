import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class longestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {
        int res=0;
        int[] map=new int[256];
        List<Integer> list=new ArrayList<Integer>();
        if(s==null) return 0;
        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)]!=0){
                list.add(res);
                res=0;
                Arrays.fill(map,0);
            }
            map[s.charAt(i)]++;
            res++;
            if(i+1==s.length())
                list.add(res);
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        String s="dvdf";
        int res=lengthOfLongestSubstring(s);
        System.out.println("result is:"+res);
    }
}
