public class firstBadVersion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Solution(n));
    }

    public static int Solution(int n) {
        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) right = mid-1;
            else left = mid + 1;
        }
        return -1;
    }
}
//Binary Search