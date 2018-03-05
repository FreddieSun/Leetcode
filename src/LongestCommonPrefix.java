public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"c","cb"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }

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
}
