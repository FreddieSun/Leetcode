public class RotateString {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length())
            return false;
        for (int i = 0; i < A.length(); i++) {
            if(B.equals(A.substring(i,A.length()) + A.substring(0,i)))
                return true;
        }
        return false;
    }

    public boolean rotateString1 (String A, String B) {
        return (A.length() == B.length() && (A + A).contains(B));
    }
}
