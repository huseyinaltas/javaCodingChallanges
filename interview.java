import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class interview {

    // 1 Reverse string
    static String reverse(String str) {
        StringBuilder build = new StringBuilder(str);
        return build.reverse().toString();
    }

    static String reverse2(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr = str.charAt(i) + newStr;
        }
        System.out.println(newStr);
        return newStr;
    }

    // 2 Swap
    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + ":" + b);
    }

    // 3 Capital
    static Boolean checkCapital(String str) {
        int aValue = 'A';
        int zValue = 'Z';
        char[] arr = str.toCharArray();
        for (char cr : arr) {
            int car = cr;
            if (car >= aValue && car <= zValue)
                return true;
        }
        return false;
    }

    // 4 Vowel
    static Boolean checkVowel(String str) {
        return str.matches(".*[aeoiu].*");
    }

    // 4-1 Vowel how many
    static void checkVowelQuantity(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('u', 0);
        map.put('o', 0);
        for (char c : str.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
        }
        for (Character c : map.keySet()) {
            if (map.get(c) > 0)
                System.out.println(c + ":" + map.get(c));
        }
    }

    // 5 Prime
    static Boolean isPrime(int num) {
        if (num == 2) {
            return true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(2);
                    return false;
                }
            }
            return true;
        }
    }

    // 6 Fibonacci
    static void PrintFibonacci(int count) {
        // 0 1 1 2 3 5 8 13
        // int a = 0; // 1 1 2
        // int b = 1; // 1 2 3
        // int c = 1; // 2 3 5
        // for (int i = 1; i <= count; i++) {
        // System.out.print(c + "-");
        // a = b;
        // b = c;
        // c = a + b;
        // }

        int a = 0; // 1 1 2
        int b = 1; // 1 2 3
        int c = 1; // 2 3 5
        for (int i = 0; i < count; i++) {
            System.out.println(a);
            a = b;
            b = c;
            c = a + b;
        }
    }

    // 7 Fibonacci
    public static int fibonacci(int count) {
        if (count <= 1)
            return count;

        return fibonacci(count - 1) + fibonacci(count - 2);
    }

    // 8 onlyOddNumber
    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                return false;
        }
        return true;
        // return list
        // .parallelStream() // parallel stream for faster processing
        // .anyMatch(x -> x % 2 != 0); // return as soon as any elements match the
        // condition
    }

    // 9 checkPalindrome
    public static boolean checkPalindromeString(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1))
                return false;
        }
        return true;
    }

    // 9.1 checkPalindrome2
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

    // 10 removeWhiteSpaces
    static String removeWhiteSpaces(String input) {
        String newString = "";
        // return input.replaceAll("\\s", "");
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isWhitespace(input.charAt(i))) {
                newString = newString + input.charAt(i);
            }
        }
        return newString;
    }

    // 11 squareRootRound
    static int squareRootRound(int num) {
        return (int) Math.round(Math.sqrt(num));
    }

    // 12 Anagram
    static Boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String lastStr1 = new String(arr1);
        String lastStr2 = new String(arr2);
        System.out.println(lastStr1);
        System.out.println(lastStr2);
        return lastStr1.equals(lastStr2);

        // // Convert strings to char arrays
        // char[] arr1 = str1.toCharArray();
        // char[] arr2 = str2.toCharArray();

        // // Sort the arrays
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // Compare the sorted arrays
        // return Arrays.equals(arr1, arr2);
    }

    // 12-1 Group Anagram
    // groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" })
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);

        }
        return new ArrayList<>(map.values());
    }

    // 13 factorial
    static long factorial(long n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
        // if (n == 1)
        // return 1;
        // else
        // return (n * factorial(n - 1));
    }

    // 14 isFactorial
    public static boolean isFactorial(int n) {
        int total = 1;
        for (int i = 1; i < n; i++) {
            total *= i;
            System.out.println(total);
            if (total == n)
                return true;
            else if (total > n)
                return false;
        }
        return false;
    }

    // 15 cipher
    public static String cipher(String message, int nSlide) {
        String last = "";
        int k = 0;
        int lngt = message.length() / nSlide;
        for (int i = 0; i <= lngt; i++) {
            for (int j = 0; j < nSlide; j++) {
                last = last + message.charAt(i + k);
                System.out.println(last);
                k = k + 4;
                if (i + k >= message.length()) {
                    System.out.println(i + ":" + k);
                    last = last + " ";
                    break;
                }
            }
            k = 0;

        }
        System.out.println(last);
        return last;

    }

    // 16 atbash
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

    // 17 incDec
    public static int incDec(int n) {
        int crr = (int) Math.pow(10, n);
        int total = 0;
        for (int i = 1; i <= crr; i++) {
            if (checkDigits(i))
                total++;
        }
        return total;
    }

    public static Boolean checkDigits(int num) {
        String numStr = num + "";
        Boolean isIt = true;
        String whichOne = "";
        for (int i = 0; i < numStr.length() - 1; i++) {
            int crr = (int) numStr.charAt(i);
            int nxt = (int) numStr.charAt(i + 1);
            if (crr == nxt) {
                isIt = true;
            } else if (crr > nxt && !whichOne.equals("increase")) {
                isIt = true;
                whichOne = "decrease";
            } else if (crr < nxt && !whichOne.equals("decrease")) {
                isIt = true;
                whichOne = "increase";
            } else {
                return false;
            }

        }
        // if (isIt)
        // System.out.println(num);
        return isIt;
    }

    // 18 licensePlate
    public static String licensePlate(String code, int group) {
        String newGrp = "";
        int loop = 0;
        for (int i = code.length() - 1; i >= 0; i--) {
            if (loop == group) {
                newGrp = "-" + newGrp;
                loop = 0;
            }
            if (code.charAt(i) != '-') {
                newGrp = code.charAt(i) + newGrp;
                loop++;
            }
        }
        System.out.println(newGrp.toUpperCase());
        return newGrp.toUpperCase();
    }

    // 19 alphabetIndex
    public static String alphabetIndex(String[] alphabet, String s) {
        int bigger = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j].equals(s.toLowerCase().charAt(i) + "") && j >= bigger) {
                    bigger = j;
                    System.out.println(s.charAt(i));
                }
            }
        }
        System.out.println((bigger + 1) + alphabet[bigger]);
        return (bigger + 1) + alphabet[bigger];
    }

    // 20 parenthesis
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

    // 22 longestCommonPrefix
    // Input: strs = ["flower","flow","flight"]
    // Output: "fl"
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

    // 22-3 longestSubstring2
    public static String longestSubstring2(String s) {
        // Set to store the characters in the current window
        String set = "";
        int left = 0;
        String max = "";

        // Loop through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If character is already in the set, move the left pointer to shrink the
            // window
            // System.out.println(set);
            while (set.contains(s.charAt(right) + "")) {
                set = s.substring(left, right);
                left++;
            }
            if (max.length() <= set.length())
                max = set + s.charAt(right);
            // Add the current character to the set
            set = set + s.charAt(right);

        }

        return max;

    }

    // 4. Longest Substring Without Repeating Characters
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0, left = 0, right = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }

    // 23 subset
    // Input: nums = [1,2,3]
    // Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Add the empty subset
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
                System.out.println(result);
                System.out.println(subset);
            }
        }
        return result;
    }

    // 23-2 subset2
    // int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3 };
    // int k = 2;
    // int[] topK = topKFrequent(nums, k);
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

    // 24 climbStairs
    // Input: n = 2
    // Output: 2
    // Explanation: There are two ways to climb to the top.
    // 1. 1 step + 1 step
    // 2. 2 steps
    public static int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return b;
    }

    // 25 sortColors
    // Input: nums = [2,0,2,1,1,0]
    // Output: [0,0,1,1,2,2]
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        for (int num : nums) {
            map.put(num, map.get(num) + 1);
        }
        int indx = 0;
        for (int i = 0; i < 3; i++) {
            int num = map.get(i);
            for (int k = 0; k < num; k++) {
                nums[indx] = i;
                indx++;
            }
        }

    }

    // 26 removeDuplicates / max twice it will happens
    // Input: nums = [1,1,1,2,2,3]
    // Output: 5, nums = [1,1,2,2,3,_]
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
        return indx;
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

    // 28 Merge
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indx = 0;
        for (int i = 0; i < m + n; i++) {
            if (i < m) {
                nums1[indx] = nums1[i];
                indx++;
            }
            if (i < n) {
                nums1[m + n - i - 1] = nums2[i];
            }
        }
        Arrays.sort(nums1);

    }

    // 29 Sum digits
    // 329 => 14 => 5
    public static int sumDigits(int num) {
        while (num >= 10) { // Keep going until num is a single digit
            int sum = 0;
            while (num > 0) { // Sum the digits
                sum += num % 10; // Add the last digit
                num = num / 10; // Remove the last digit
            }
            num = sum; // Set num to the sum of digits
        }
        return num; // Return the result, now a single digit

    }

    // 30 Word Search
    public static int solution(char[][] board, String word) {
        int count = 0;
        int n = board.length;
        int m = board[0].length;
        char[] wordArr = word.toCharArray();
        int wordLen = word.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j <= m - wordLen && matches(board, i, j, wordArr, 0, 1)) {
                    count++;
                }
                if (i <= n - wordLen && matches(board, i, j, wordArr, 1, 0)) {
                    count++;
                }
                if (i <= n - wordLen && j <= m - wordLen && matches(board, i, j, wordArr, 1, 1)) {
                    count++;
                }
                if (i <= n - wordLen && j >= wordLen - 1 && matches(board, i, j, wordArr, 1, -1)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    private static boolean matches(char[][] board, int row, int col, char[] word, int rowDir, int colDir) {
        for (int k = 0; k < word.length; k++) {
            if (board[row + k * rowDir][col + k * colDir] != word[k]) {
                return false;
            }
        }
        return true;
    }

    // 31 Longest Valid Parentheses
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base index
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            System.out.println(stack);
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

    // 32 - Merge 2 arrays alternating
    public static int[] mergeArrays(int[] a, int[] b) {
        int lng = 0;
        int arr[] = new int[a.length + b.length];
        for (int i = 0; i < arr.length; i++) {
            if (a.length > lng) {
                arr[i] = a[lng];
            }
            if (b.length > lng) {
                arr[i + 1] = b[lng];
                i++;
            }
            lng++;
        }
        return arr;
    }

    // 33 - Merge 2 Numbers Alternating
    public static int numMerge(int a, int b) {
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);
        StringBuilder str = new StringBuilder();
        int aLength = 0, bLength = 0;

        while (aLength < aString.length() || bLength < bString.length()) {
            if (aLength < aString.length()) {
                str.append(aString.charAt(aLength));
                aLength++;
            }
            if (bLength < bString.length()) {
                str.append(bString.charAt(bLength));
                bLength++;
            }
        }
        long lng = Long.parseLong(str.toString());
        if (lng > 100000000) {
            return -1;
        }
        return (int) lng;
    }

    // 34 - biggestTime
    public static String biggestTime(int a, int b, int c, int d) {
        int all[] = { a, b, c, d };
        int ind1 = 0;
        int ind2 = 0;
        int maxHr = -1;
        int maxMin = -1;

        // HR
        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all.length; j++) {
                if (i == j)
                    continue;

                if (all[i] * 10 + all[j] < 24 && maxHr < all[i] * 10 + all[j]) {
                    maxHr = all[i] * 10 + all[j];
                    ind1 = i;
                    ind2 = j;
                }
            }
        }

        // MIN
        for (int i = 0; i < all.length; i++) {
            if (ind1 == i || ind2 == i)
                continue;
            for (int j = 0; j < all.length; j++) {
                if (i == j)
                    continue;
                if (ind1 == j || ind2 == j)
                    continue;
                if (all[i] * 10 + all[j] < 60 && maxMin < all[i] * 10 + all[j]) {
                    maxMin = all[i] * 10 + all[j];
                }
            }
        }
        if (maxHr == -1 || maxMin == -1)
            return "NOT POSSIBLE";
        String hr = String.valueOf(maxHr);
        String min = String.valueOf(maxMin);
        if (maxHr / 10 == 0) {
            hr = 0 + "" + maxHr;
        }
        if (maxMin / 10 == 0) {
            min = 0 + "" + maxMin;
        }
        return String.valueOf(hr + ":" + min);
    }

    // 35 - mincostTickets
    public static int mincostTickets(int[] days) {
        int maxDay = days[days.length - 1];
        boolean[] travelDay = new boolean[maxDay + 1];

        for (int day : days)
            travelDay[day] = true;

        int[] dp = new int[maxDay + 1];
        dp[0] = 0;
        System.out.println(Arrays.toString(travelDay));
        for (int i = 1; i <= maxDay; i++) {
            if (!travelDay[i]) {
                dp[i] = dp[i - 1];
                continue;
            }

            // Option 1: 1-day ticket (Cost 2)
            dp[i] = dp[i - 1] + 2;

            // Option 2: 7-day ticket (Cost 7)
            if (i >= 7) {
                dp[i] = dp[i] < dp[i - 7] + 7 ? dp[i] : dp[i - 7] + 7;
            } else {
                dp[i] = dp[i] < 7 ? dp[i] : 7;
            }

            // Option 3: 30-day ticket (Cost 25)
            if (i >= 30) {
                dp[i] = dp[i] < dp[i - 30] + 25 ? dp[i] : dp[i - 30] + 25;
            } else {
                dp[i] = dp[i] < 25 ? dp[i] : 25;
            }

        }

        return dp[maxDay];
    }

    // 36 sort012
    static void sort012(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    // 37

    /**
     * Example:
     * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
     * Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
     */
    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] cr = str.toCharArray();
            Arrays.sort(cr);
            String sortedStr = new String(cr);
            if (!map.containsKey(sortedStr)) {
                List<String> lst = new ArrayList<>();
                map.put(sortedStr, lst);
                continue;
            }
            map.get(sortedStr).add(sortedStr);
        }
        return new ArrayList<>(map.values());
    }

    // 38 twoSum
    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return new int[] { map.get(nums[i]), i };
            map.put(target - nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

        System.out.println(groupAnagrams(input));
    }

}
