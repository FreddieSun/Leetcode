public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int[] alphabet=new int[26];
        for(int i=0;i<s.length();i++)
            alphabet[s.charAt(i)-'a']++;
        for(int j=0;j<t.length();j++){
            alphabet[t.charAt(j)-'a']--;
        }
        for(int i=0;i<26;i++)
            if(alphabet[i]!=0)
                return false;
        return true;
    }
}
