public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution(nums);
    }

    public static void Solution(int[] nums) {
        int i;
        int insertPos = 0;

        for(i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                nums[insertPos++] = nums[i];
            }
        }

        while(insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
