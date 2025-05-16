import java.math.BigInteger;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Solution(digits));
    }

    public static int[] Solution(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }

        BigInteger res = new BigInteger(sb.toString());
        res = res.add(BigInteger.ONE); 

        String resultStr = res.toString();
        int[] result = new int[resultStr.length()];
        for (int i = 0; i < resultStr.length(); i++) {
            result[i] = resultStr.charAt(i) - '0';
        }

        return result;
    }
}
