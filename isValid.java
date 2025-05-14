import java.util.ArrayList;
import java.util.Stack;

public class isValid {
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(Solution(s));
    }

    public static boolean Solution(String s) {
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> openBrackets = new ArrayList<>();
        ArrayList<Character> closedBrackets = new ArrayList<>();

        // Initialize the brackets
        openBrackets.add('{');
        openBrackets.add('(');
        openBrackets.add('[');

        closedBrackets.add('}');
        closedBrackets.add(')');
        closedBrackets.add(']');

        if(closedBrackets.contains(s.charAt(0))) return false;

        for(int i=0;i<s.length();i++) {
            if(openBrackets.contains(s.charAt(i))) {
                stack.add(s.charAt(i));
            }

            if(closedBrackets.contains(s.charAt(i))) {
                if(stack.isEmpty()) return false;
                char top = stack.peek();

                if(top == openBrackets.get(closedBrackets.indexOf(s.charAt(i)))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
