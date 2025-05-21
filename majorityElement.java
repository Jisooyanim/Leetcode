import java.util.HashSet;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(Solution(nums));
    }

    public static int Solution(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int j = 0;

        if(nums.length == 1) return nums[0];
        while (j < nums.length) {
            int base = nums[j];
            int count = 0;

            if(!seen.contains(base)) {
                for(int i = 0;i<nums.length;i++) {
                    if(base == nums[i]) {
                        count++;
                    }
                }

                if(count > nums.length / 2) {
                    return base;
                }

                seen.add(base);
            }
            j++;
        }
        return 0;
    }
}