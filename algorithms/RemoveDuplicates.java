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
        int[] numx = { 1, 2, 2, 3, 3, 3, 4, 4, 4 };
        int rrs = removeDuplicates(numx);
        int rrs1 = removeDuplicates1(numx);
        System.out.println("All possible duplicate: " + rrs);
        System.out.println("All possible duplicate: " + rrs1);
        // output: All possible duplicate: 5
        // remove some duplicates in-place such that each unique element appears at most
        // twice.
    }

    public static int removeDuplicates1(int[] nums) {
        return 0;
    }
}