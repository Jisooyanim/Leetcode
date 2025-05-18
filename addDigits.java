public class addDigits {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(Solution(num));
    }

    public static int Solution(int num) {
        return 1 + (num - 1) % 9;
    }
}
// Digital root
// The digital root of a number is equal to the remainder when 
// that number is divided by 9.
//https://brilliant.org/wiki/digital-root/#:~:text=The%20digital%20root%20or%20digital,single%2Ddigit%20number%20is%20reached.