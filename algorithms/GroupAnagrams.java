package algorithms;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
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

    public static void main(String[] args) {
        String[] lsts = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> resls = groupAnagrams(lsts);
        System.out.println("All possible groups: " + resls);
    }
}