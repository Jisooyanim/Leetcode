public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"dog","racecar","car"};
        System.out.println(Solution(s));
    }

    public static String Solution(String[] s) {
        String prefix = s[0];

        for (int i=1; i < s.length;i++){
            while (!s[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
