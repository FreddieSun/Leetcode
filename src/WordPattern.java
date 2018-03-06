import java.util.HashMap;

public class WordPattern {
    // 这个方法不可取，或者得加关于Integer返回值的限制，因为Integer在-128 -- 127之间才能用 == 来比较 ，其余的只能用equals。 但是
    // equals比较，null的话会NPE。 所以这个方法不推荐。
    public static boolean wordPattern(String pattern, String str) {
        String[] strs = str.split("\\s");
        int size1 = pattern.length();
        int size2 = strs.length;
        if (pattern.length() != strs.length)
            return false;
        HashMap<Character, Integer> cmap = new HashMap<>();
        HashMap<String, Integer> smap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!cmap.get(pattern.charAt(i)).equals(smap.get(strs[i])))
                return false;
            cmap.put(pattern.charAt(i),i);
            smap.put(strs[i],i);
        }
        return true;
    }

    public static boolean wordPattern1(String pattern, String str) {
        String[] strs = str.split("\\s");
        if (pattern.length() != strs.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char temp = pattern.charAt(i);
            if (map.containsKey(temp) && !map.get(temp).equals(strs[i]))
                return false;
            else if (!map.containsKey(temp) && map.containsValue(strs[i]))
                return false;
            map.put(pattern.charAt(i),strs[i]);
        }
        return true;
    }

    public static void main(String[] args) {
//        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
//
//
//        String str = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
//        System.out.println(wordPattern(pattern,str));
        Integer a = 128;
        Integer b = 128;
        System.out.println("a==b"+"  "+String.valueOf(a==b));
        System.out.println("a.equals(b)"+"  "+String.valueOf(a.equals(b)));
    }

}
