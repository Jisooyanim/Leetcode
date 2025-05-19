public class triangleType {
    public static void main(String[] args) {
        int[] nums = {3,3,3};
        System.out.println(Solution(nums));
    }

    public static String Solution(int[] nums) {
        int sideA = nums[0] + nums[1];
        int sideB = nums[0] + nums[2];
        int longSide = nums[1] + nums[2];

        if (sideA <= nums[2] || sideB <= nums[1] || longSide <= nums[0]) return "none";

        if (sideA == sideB && sideB == longSide) return "equilateral";
        else if (sideA == sideB || sideB == longSide || sideA == longSide) return "isosceles";
        else return "scalene";
    }
}
