public class isPalindrome {
    public static void main(String[] args) {
        int x = 121;
        int y = -121;
        int z = 10;
        System.out.println(Solution(x));
        System.out.println(Solution(y));
        System.out.println(Solution(z));
    }

    public static boolean Solution(int x) {
        int div = x;
        int rev = 0;

        while(div != 0) {
            int rem = div % 10;
            rev = rev * 10 + rem;
            div /= 10;
        }

        if(x == rev && x >= 0) {
            return true;
        }
        return false;
    }
}
