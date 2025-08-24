package algorithms;

import java.util.*;

public class TopKFrequent {
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
                .toList();
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3 };
        int k = 2;
        int[] topK = topKFrequent(nums, k);
        System.out
                .println("Top " + k + " frequent elements in " + Arrays.toString(nums) + ": " + Arrays.toString(topK));
    }
}