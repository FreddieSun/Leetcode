import java.util.HashMap;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hmap=new HashMap<Character,Character>();
        if(s==null||t==null) return true;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(hmap.containsKey(a)){
                if(hmap.get(a).equals(b)) continue;
                else return false;
            } else{
                if(!hmap.containsValue(b)){
                    hmap.put(a,b);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
