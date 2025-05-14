import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Solution(nums));
    }

    // public static int Solution(int[] nums) {
    //     // Auto duplicate
    //     Set<Integer> set = new HashSet<>();

    //     for(int i = 0;i < nums.length; i++) {
    //         set.add(nums[i]);
    //     }

    //     // Auto sort
    //     TreeSet<Integer> treeSet = new TreeSet<>(set);

    //     return treeSet.size();
    // }

    public static int Solution(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}