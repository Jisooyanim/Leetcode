import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {    
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(Substring(s));
    }

    public static int Substring(String s) {
        int maxLen = 0;
        int left = 0;
        Set<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (seen.contains(current)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(current);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

//result.contains(String.valueOf(s.charAt(i)))