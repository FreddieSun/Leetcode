public class IsIntegerPalindrome {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        while(x != 0) {
            sb.insert(0, x%10);
            x /= 10;
        }
        String s = sb.toString();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
