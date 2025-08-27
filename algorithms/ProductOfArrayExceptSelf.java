package algorithms;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int total = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j)
                    total *= nums[j];
            }
            result[i] = total;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = productExceptSelf(nums);
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("\n");
        int[] result1 = productExceptSelf1(nums);
        for (int r : result1) {
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
