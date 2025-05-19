import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class isHappy {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Solution(n));
    }

    public static boolean Solution(int n) {
        List<Integer> digits = new ArrayList<>();
        HashSet<Integer> dups = new HashSet<>();
        int div = n;
        boolean notLoop = true;

        while(notLoop) {
            digits.clear();
            while (div != 0) {
                int rem = div % 10;
                digits.add(rem);
                div /= 10;
            }

            int ans = 0;
            for(int i=0;i<digits.size();i++) {
                ans = (digits.get(i) * digits.get(i)) + ans;
            }

            if (dups.contains(ans)) {
                notLoop = false;
            }

            dups.add(ans);
            div = ans;
        }

        return div==1;
    }
}