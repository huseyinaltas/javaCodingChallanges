package algorithms;

import java.util.Arrays;

public class SortArray {
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
            if (!swapped)
                break;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] numsXX = { 5, 2, 3, 1 };
        System.out.println("Before sorting: " + Arrays.toString(numsXX));
        sortArray1(numsXX);
        System.out.println("After sorting: " + Arrays.toString(numsXX));
        // output: Before sorting: [5, 2, 3, 1]
    }

    public static void sortArray1(int[] nums) {

    }
}