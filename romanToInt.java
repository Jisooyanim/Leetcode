import java.util.HashMap;

public class romanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(Solution(s));
    }

    public static int Solution(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        // Initialize Roman numerals
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            
            if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
                res -= current;
            } else {
                res += current;
            }
        }
        return res;
    }
}