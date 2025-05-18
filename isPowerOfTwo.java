public class isPowerOfTwo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Solution(n));
    }

    public static boolean Solution(int n) {
        long base = 1;

        if (n == 1) return true;
        if (n % 2 != 0) return false;

        while (base < n) {
            base *= 2;
        }

        if (base != n){
            return false;
        }

        return true;
    }
}