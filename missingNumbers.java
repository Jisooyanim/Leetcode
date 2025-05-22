public class missingNumbers {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(Solution(nums));
    }

    public static int Solution(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(i != nums[i]) {
                return i;
            }
        }

        return nums.length;
    }
}