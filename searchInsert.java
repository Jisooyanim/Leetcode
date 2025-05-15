public class searchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target= 7;
        System.out.println(Solution(nums, target));
    }

    public static int Solution(int[] nums, int target) {
        int res = 0;
        for(int i=0; i < nums.length;i++){
            if(nums[i] == target){
                res = i;
            } else if (nums[i] < target) {
                res = i + 1;
            }
        }

        return res;
    }
}
