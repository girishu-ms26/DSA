package LeetCode;

import java.util.Stack;

public class validParentheses {
    public static void main(String[]args) {
        String s = "(]";
        String s1 = "{}";
        String s2 = "{}()";
        String s3 = "{[]}";
        System.out.println(isValid(s3));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
