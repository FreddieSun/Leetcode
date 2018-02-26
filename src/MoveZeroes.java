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

    public void moveZeroes2(int[] nums) {
        // kind of like double pointer.
        if (nums == null || nums.length == 0)
            return;

        int insertIndex = 0;
        for (int num : nums){
            if (num != 0)
                nums[insertIndex++] = num;
        }

        while (insertIndex < nums.length){
            nums[insertIndex++] = 0;
        }


    }
}
