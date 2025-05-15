public class strStr {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(Solution(haystack, needle));
    }

    public static int Solution(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
