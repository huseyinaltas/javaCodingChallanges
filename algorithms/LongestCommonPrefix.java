package algorithms;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (String s : strs) {
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] testStrs = { "flower", "flow", "flight" };
        String prefix = longestCommonPrefix1(testStrs);
        System.out.println("Longest common prefix for " + java.util.Arrays.toString(testStrs) + ": \"" + prefix + "\"");
        // output: Longest common prefix for ["flower", "flow", "flight"]: "fl"
    }

    public static String longestCommonPrefix1(String[] strs) {
        return null;
    }
}