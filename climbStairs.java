public class climbStairs {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(Solution(x));
    }

    public static int Solution(int x) {
        int steps = 1;
        int prev = 1;
        int next = 1;
        int sum = 1;

        if (x == 1) return sum;
        while(steps != x) {
            sum = prev + next;
            steps++;
            prev = next;
            next = sum;
        }
        return sum;
    }
}