public class StrStr {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int srcSize = haystack.length();
        int dstSize = needle.length();
        for (int i = 0; i <= srcSize - dstSize; i++) {
            for (int j = 0; j < dstSize && haystack.charAt(i+j) == needle.charAt(j); j++) {
                if (j == dstSize - 1)
                    return i;
            }
        }
        return -1;
    }
}
