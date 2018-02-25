public class MoveZeroes {
    // just use the insertion sort thought
    public void moveZeroes(int[] nums) {
        // using the insertion sort thought
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j > 0; j--){
                if (nums[j-1] == 0){
                    swap (nums, j, j-1);
                }
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
