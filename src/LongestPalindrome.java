public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";
        String res = "";
        int max = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                dp[j][i] = (s.charAt(i) == s.charAt(j)) && ((i - j <= 2) || dp[j+1][i-1]);
                if(dp[j][i]) {
                    if (i - j + 1 > max){
                        max = i - j + 1;
                        res = s.substring(j, i + 1);
                    }
                }
            }
        }
        return res;
    }
}
