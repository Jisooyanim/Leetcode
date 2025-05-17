public class singleNumber {
    public static void main(String[] args) {
        // int[] nums = {2,2,1};
        int[] nums = {1,2,4,1,2};
        System.out.println(Solution(nums));
    }

    public static int Solution(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
//https://www.baeldung.com/java-xor-operator