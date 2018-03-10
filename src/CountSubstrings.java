public class CountSubstrings {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int res = 0;
        for (int j = 0; j < s.length();j++) {
            for (int i = 0; i <= j; i++) {
                res += isPalindrom(s, i, j);
            }
        }
        return res;
    }
    public int isPalindrom(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return 0;
            }
        }
        return 1;
    }

    //中心扩散法， 中心扩散法，能保证唯一性。 每一组都不一样

    int count = 0;
    public int countSubstring1(String s) {
        if (s == null || s.length() == 0)
            return 0;
        for (int i = 0; i < s.length(); i++) {
            extendPalindrom(s,i,i);
            extendPalindrom(s,i,i+1);
        }
        return count;
    }

    public void extendPalindrom(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }


    // dp
    public int countSubstrings2(String s) {
        // dp 方法
        int res = 0;
        if (s.length() == 0 || s == null)
            return res;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                dp[j][i] =s.charAt(i) == s.charAt(j) && ((i - j <= 2) || dp[j+1][i-1]);
                if(dp[i][j])
                    res++;
            }
        }
        return res;
    }
}
