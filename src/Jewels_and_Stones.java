public class Jewels_and_Stones {
    public int numJewelsInStones(String J, String S) {
        int[] jmap=new int[256];
        int[] smap=new int[256];
        int res=0;
        for(int i=0;i<J.length();i++){
            jmap[J.charAt(i)]++;
        }
        for(int i=0;i<S.length();i++){
            if(jmap[S.charAt(i)]!=0){
                res+=jmap[S.charAt(i)];
            }
        }
        return res;
    }
}
