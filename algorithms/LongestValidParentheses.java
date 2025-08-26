package algorithms;

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base index
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String testStr = "(()(()";
        int resultX = longestValidParentheses1(testStr);
        System.out.println("Longest valid parentheses length for input \"" + testStr + "\": " + resultX);
        // output: Longest valid parentheses length for input "(()": 2
    }

    public static int longestValidParentheses1(String s) {
        return -1;
    }
}