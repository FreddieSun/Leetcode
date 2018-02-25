public class Merge {
    // runtime limit exception
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int mergeIndex = m+n-1;

        while (index2 >= 0){
            if (index1 >= 0 && nums1[index1] > nums2[index2]){
                nums1[mergeIndex] = nums1[index1];
                index1--;
            } else if (index1 >= 0 && nums1[index1] <= nums2[index2]){
                nums1[mergeIndex] = nums2[index2];
                index2--;
            }
            mergeIndex--;
        }
    }

    // accepted
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int mergeIndex = m+n-1;

        while (index1 >= 0 && index2 >= 0){
            if (nums1[index1] > nums2[index2]){
                nums1[mergeIndex] = nums1[index1];
                index1--;
            } else if (nums1[index1] <= nums2[index2]){
                nums1[mergeIndex] = nums2[index2];
                index2--;
            }
            mergeIndex--;
        }
        while(index2 >= 0){
            nums1[mergeIndex--] = nums2[index2--];
        }
    }

    // just 3 line code
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>-1&&j>-1) nums1[k--]=(nums1[i]>nums2[j]) ? nums1[i--] : nums2[j--];
        while(j>-1) nums1[k--]=nums2[j--];
    }


}
