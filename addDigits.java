public class addDigits {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(Solution(num));
    }

    public static int Solution(int num) {
        return 1 + (num -1) % 9;
    }
}
