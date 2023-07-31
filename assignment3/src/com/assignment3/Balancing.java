package com.assignment3;
import java.util.Stack;
public class Balancing {
	public static boolean isBalancedBrackets(String inputString) {
        Stack  stack = new Stack();
        char[] bracketsMap = {')', ']', '}'};

        for (char ch : inputString.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = (char) stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
