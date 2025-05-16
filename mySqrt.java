public class mySqrt {
    public static void main(String[] args) {
        int x = 12;
        System.out.println(Solution(x));
    }

    public static int Solution(int x) {
        // return (int)Math.sqrt(x);

        int res = 0;
        long ans =0;

        while(ans <= x) {
            res++;
            ans = (long) res * res;
        }
        return res - 1;
    }
}
