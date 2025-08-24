package algorithms;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        while (right < s.length()) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcbbcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println(
                "Length of longest substring without repeating characters for input \"" + input + "\": " + result);
    }
}