import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] n = {1,2,3,1};
        System.out.println(Solution(n));
    }

    public static boolean Solution(int[] nums) {
        HashSet<Integer> dups = new HashSet<>();

        for(int i=0;i<nums.length;i++) {
            if (dups.contains(nums[i]))
                return true;
            dups.add(nums[i]);
        }
        return false;
    }
}
