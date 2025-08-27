package algorithms;

import java.util.*;

public class IsValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put('}', '{');
        mapping.put(']', '[');
        mapping.put(')', '(');
        for (char c : s.toCharArray()) {
            if (mapping.containsValue(c)) {
                stack.add(c);
            } else if (mapping.containsKey(c)) {
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testStr5 = "{[()]}";
        boolean isValidResult = isValid(testStr5);
        boolean isValidResult1 = isValid1(testStr5);
        System.out.println("Is \"" + testStr5 + "\" a valid bracket sequence? " + isValidResult);
        System.out.println("Is \"" + testStr5 + "\" a valid bracket sequence? " + isValidResult1);
        // output: Is "{[()]}" a valid bracket sequence? true
    }

    public static boolean isValid1(String s) {
        return false;

    }
}