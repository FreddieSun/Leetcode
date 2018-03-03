public class HIndexII {
    public int hIndex(int[] citations) {
        int res = 0;
        while (res < citations.length && citations[citations.length - res - 1] > res)
            res++;
        return res;
    }
}
