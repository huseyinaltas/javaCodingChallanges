import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.LinkedHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class interview3 {

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

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> topK = frequencyMap.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        for (int i = 0; i < k; i++) {
            nums[i] = topK.get(i);
        }
        return Arrays.copyOfRange(nums, 0, k);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
    }

    public static int sumDigits(int num) {
        while (num > 9) {
            int total = 0;
            while (num != 0) {
                total = total + num % 10;
                num = num / 10;
            }
            num = total;
        }
        return num;
    }

    public static int removeDuplicates(int[] nums) {
        int indx = 1;
        int occur = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                occur++;
            else
                occur = 1;
            if (occur <= 2) {
                nums[indx] = nums[i];
                indx++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return indx;
    }

    static public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] cr = str.toCharArray();
            Arrays.sort(cr);
            String sortedStr = new String(cr);
            if (!map.containsKey(sortedStr)) {
                List<String> lst = new ArrayList<>();
                map.put(sortedStr, lst);
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }

    static public int longestValidParentheses(String s) {
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

    public static String atbash(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                // A-Z → Z-A
                char mirrored = (char) ('Z' - (ch - 'A'));
                result.append(mirrored);
            } else if (Character.isLowerCase(ch)) {
                // a-z → z-a
                char mirrored = (char) ('z' - (ch - 'a'));
                result.append(mirrored);
            } else {
                // Keep non-letters unchanged
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static boolean checkPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

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

    // 21 romanToInt
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int prev = 0;
        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = romanMap.get(s.charAt(i));
            if (curr < prev)
                total -= curr;
            else
                total += curr;
            prev = curr;
        }
        return total;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (String s : strs) {
            System.out.println(prefix);
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }

    // 27 sortArray
    public static void sortArray(int[] nums) {
        int temp = 0;
        boolean swapped = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] >= nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            System.out.println("*");
            if (!swapped)
                break;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        /**
         * Example:
         * Input: "abcbbcbb"
         * Output: 3
         */
        String input = "abcbbcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println(
                "Length of longest substring without repeating characters for input \"" + input + "\": " + result);

        /**
         * Example:
         * Input: nums = [1, 1, 1, 2, 2, 3, 3, 3], k = 2
         * Output: [1, 3]
         */
        int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3 };
        int k = 2;
        int[] topK = topKFrequent(nums, k);
        System.out
                .println("Top " + k + " frequent elements in " + Arrays.toString(nums) + ": " + Arrays.toString(topK));

        /**
         * Example:
         * Input: [1, 2, 3]
         * Output: [[], [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]]
         */
        int[] subsetInput = { 1, 2, 3 };
        List<List<Integer>> subsets = subsets(subsetInput);
        System.out.println("All possible subsets for input " + Arrays.toString(subsetInput) + ": " + subsets);

        /**
         * Example:
         * Input: 123456
         * Output: 21
         */
        int num = 123456;
        int total = sumDigits(num);
        System.out.println("Sum of digits of number " + num + ": " + total);

        // 26 removeDuplicates / max twice it will happens
        // Input: nums = [1,1,1,2,2,3]
        // Output: 5, nums = [1,1,2,2,3,_]
        int numx[] = { 1, 1, 1, 2, 2, 3 };
        int rrs = removeDuplicates(numx);
        System.out.println("All possible duplicate: " + rrs);

        /**
         * Example:
         * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
         * Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
         */
        String lsts[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> resls = groupAnagrams(lsts);
        System.out.println("All possible groups: " + resls);

        /**
         * Example:
         * Input: s = ")()())"
         * Output: 4
         */
        String testStr = "()";
        int resultX = longestValidParentheses(testStr);
        System.out.println("Longest valid parentheses length for input \"" + testStr + "\": " + resultX);

        /**
         * Example:
         * Input: "Hello, World!"
         * Output: "Svool, Dliow!"
         */
        String inputStr = "Hello, World!";
        String result5 = atbash(inputStr);
        System.out.println("Atbash cipher for input \"" + inputStr + "\": " + result5);

        /**
         * Example:
         * Input: "madam"
         * Output: true
         */
        String testStr1 = "madam";
        boolean isPalindrome = checkPalindrome(testStr1);
        System.out.println("Is \"" + testStr1 + "\" a palindrome? " + isPalindrome);

        /**
         * Example:
         * Input: s = "{[()]}"
         * Output: true
         */
        String testStr5 = "{[()]}";
        boolean isValidResult = isValid(testStr5);
        System.out.println("Is \"" + testStr + "\" a valid bracket sequence? " + isValidResult);

        /**
         * Example:
         * Input: s = "MCMXCIV"
         * Output: 1994
         */
        String roman = "MCMXCIV";
        result = romanToInt(roman);
        System.out.println("Roman numeral \"" + roman + "\" converted to integer: " + result);

        /**
         * Example:
         * Input: strs = ["flower", "flow", "flight"]
         * Output: "fl"
         */
        String[] testStrs = { "flower", "flow", "flight" };
        String prefix = longestCommonPrefix(testStrs);
        System.out.println("Longest common prefix for " + Arrays.toString(testStrs) + ": \"" + prefix + "\"");

        /**
         * Example:
         * Input: nums = [5, 2, 3, 1]
         * Output: [1, 2, 3, 5]
         */
        int[] numsXX = { 5, 2, 3, 1 };
        System.out.println("Before sorting: " + Arrays.toString(numsXX));
        sortArray(numsXX);
        System.out.println("After sorting: " + Arrays.toString(numsXX));

    }
}