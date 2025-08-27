package algorithms;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        int[] result1 = twoSum1(nums, target);
        System.out.println("Indices of the two numbers that add up to " + target + ": " + Arrays.toString(result));
        System.out.println("Indices of the two numbers that add up to " + target + ": " + Arrays.toString(result1));
        // output: Indices of the two numbers that add up to 9: [0, 1]
    }

    public static int[] twoSum1(int[] nums, int target) {
        throw new IllegalArgumentException("target is not matched");
    }
}