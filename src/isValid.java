import java.util.Stack;

public class isValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (Character temp : c) {
            if (temp == '(')
                stack.push(')');
            else if(temp == '{')
                stack.push('}');
            else if(temp == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != temp)
                return false;
        }
        return stack.isEmpty();
    }
}
