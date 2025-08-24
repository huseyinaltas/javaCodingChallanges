package algorithms;

import java.util.Arrays;

public class RemoveDuplicates {
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

    public static void main(String[] args) {
        int[] numx = { 1, 1, 1, 2, 2, 3 };
        int rrs = removeDuplicates(numx);
        System.out.println("All possible duplicate: " + rrs);
        // output: All possible duplicate: 5
    }
}