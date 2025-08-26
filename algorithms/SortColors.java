package algorithms;

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                // Swap nums[mid] and nums[high]
                swap(nums, high, mid);
                high--;
            }
        }
    }

    static void swap(int arr[], int a, int b) {
        if (a != b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);

        System.out.print("Sorted Colors: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: Sorted Colors: 0 0 1 1 2 2

        // Explanation:
        // - Move 0s to the front
        // - Move 2s to the back
        // - Leave 1s in the middle
        // - Done in-place with two pointers (low, high) and one scanner (mid)
    }

    public static void sortColors1(int[] nums) {

    }
}
