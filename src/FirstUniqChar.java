import java.util.HashMap;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        if (s.length() == 0 && s == null)
            return -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }

        }
        return -1;
    }

    public int firstUniqChar1(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
    }
}
