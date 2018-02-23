public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int num=0;
        int val=x^y;
        while(val!=0){
            num++;
            val &= val-1;
        }
        return num;
    }
}
