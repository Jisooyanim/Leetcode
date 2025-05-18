public class isUgly {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Solution(n));
    }

    public static boolean Solution(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }
}