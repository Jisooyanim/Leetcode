public class isPowerOfThree {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(Solution(n));
    }

    public static boolean Solution(int n) {
        long base = 1;

        if (n == 1) return true;
        if (n % 3 != 0) return false;

        while (base < n) {
            base *= 3;
        }

        if (base != n){
            return false;
        }

        return true;
    }
}