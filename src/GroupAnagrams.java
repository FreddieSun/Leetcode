import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0 || strs == null)
            return new ArrayList<List<String>>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] tempChar = strs[i].toCharArray();
            Arrays.sort(tempChar);
            String tempString = String.valueOf(tempChar);
            if (!map.containsKey(tempString)) {
                map.put(tempString,new ArrayList<String>());
            }
            map.get(tempString).add(strs[i]);
        }
        // HashMap.values() return the collection views
        return new ArrayList<List<String>>(map.values());

    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0 || strs == null)
            return res;
        // Integer用来表示这个String应该在第几个list里
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String str = new String(temp);

            if (map.containsKey(str)) {
                List<String> tempList = res.get(map.get(str));
                tempList.add(s);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(s);
                map.put(str,res.size());
                res.add(tempList);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String[] list = {"b","a","cd","dc"};
        Arrays.sort(list);
        for(String s:list)
            System.out.println(s);
    }

}
