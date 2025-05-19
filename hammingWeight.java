public class hammingWeight {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(Solution(n));
    }

    public static int Solution(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;

        for(int i=0; i<binary.length();i++) {
            if(binary.charAt(i)== '1') {
                count++;
            }
        }

        return count;
    }
}
