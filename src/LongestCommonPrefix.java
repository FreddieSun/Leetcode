import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"c","cb"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }

    /*

    The basic idea is:
        1. find the substring with the minimum size, record its’ size and the index
        2. Pick the ith character at the substring and compare it with the element at this location in other substring
        3. if anyone doesn’t contains this char, return the current Stringbuffer
        4. if everyone contains this substring, append the char to the StringBuffer
        5. Increment i until i = minimum size.
        6. repeat 2-5

     */

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuffer sb = new StringBuffer();
        int minSize = strs[0].length();
        int index = 0;
        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() < minSize) {
                minSize = strs[i].length();
                index = i;
            }
        }
        for (int i = 0; i < minSize; i++) {
            char temp = strs[index].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != temp) {
                    return sb.toString();
                }
            }
            sb.append(temp);
        }
        return sb.toString();
    }

    // after sorting , the last and the first would have the common prefix (if have)
    public String longestCommonPrefix2 (String[] strs) {
        StringBuffer res = new StringBuffer();
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        char[] a = strs[0].toCharArray();
        char[] b = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (b.length > i && b[i] == a[i])
                res.append(b[i]);
            else
                return res.toString();
        }
        return res.toString();
    }

}
