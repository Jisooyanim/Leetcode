public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(Solution(s));
    }

    public static int Solution(String s) {
        String[] parts = s.split(" ");
        String lastWord = parts[parts.length - 1];
        // System.out.println(lastWord);

        return lastWord.length();
    }
}
