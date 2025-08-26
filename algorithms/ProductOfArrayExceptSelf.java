package algorithms;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 1, right = 1;

        for (int i = 0; i < n; i++) {
            result[i] = left;
            left *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = productExceptSelf1(nums);
        for (int r : result) {
            System.out.print(r + " ");
        }
        // output: 24 12 8 6
        // Explanation: For the input array [1, 2, 3, 4]:
        // - The product of all elements except self for index 0 is 2 * 3 * 4 = 24.
        // - The product of all elements except self for index 1 is 1 * 3 * 4 = 12.
        // - The product of all elements except self for index 2 is 1 * 2 * 4 = 8.
        // - The product of all elements except self for index 3 is 1 * 2 * 3 = 6.
        // Thus, the output array is [24, 12, 8, 6].
    }

    public static int[] productExceptSelf1(int[] nums) {
        return null;
    }
}
