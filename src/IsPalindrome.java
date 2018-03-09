public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s == null)
            return true;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (right > left && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                left++;
                right--;
            } else {
                return false;
            }

        }
        return true;
    }
}
