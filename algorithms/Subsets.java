package algorithms;

import java.util.*;

public class Subsets {
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

    public static void main(String[] args) {
        int[] subsetInput = { 1, 2, 3 };
        List<List<Integer>> subsets = subsets(subsetInput);
        System.out.println("All possible subsets for input " + Arrays.toString(subsetInput) + ": " + subsets);
        // output: All possible subsets for input [1, 2, 3]: [[], [1], [2], [1, 2],
        // [3],[1, 3], [2, 3], [1, 2, 3]]
    }

    public static List<List<Integer>> subsets1(int[] nums) {
        return null;
    }
}