import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {

        int res = 0;
        int N = citations.length;
        // 需要满足两个条件： 1. h of his N citations has at least h citations each.
        //                 2. The other N-h papers no more than h citations each.
        Arrays.sort(citations);

        while (res < N && citations[N - res - 1] > res)
            res++;
        return res;
    }

}
