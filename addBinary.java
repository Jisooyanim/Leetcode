import java.math.BigInteger;

public class addBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(Solution(a, b));
    }

    public static String Solution(String a, String b) {
        BigInteger intA = new BigInteger(a, 2);
        BigInteger intB = new BigInteger(b, 2);
        BigInteger toConv  = intA.add(intB);

        return toConv.toString(2);
    }
}
