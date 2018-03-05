public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.length() == 0 || s == null)
            return 0;

        int res = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) != ' ') {
                res++;
            }
            else
                break;
        }
        return res;
    }
}
