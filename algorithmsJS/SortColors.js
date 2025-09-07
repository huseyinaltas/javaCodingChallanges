class SortColors {
  static sortColors(nums) {
    let low = 0,
      mid = 0,
      high = nums.length - 1;
    while (mid <= high) {
      if (nums[mid] === 0) {
        [nums[mid], nums[low]] = [nums[low], nums[mid]];
        low++;
        mid++;
      } else if (nums[mid] === 1) {
        mid++;
      } else {
        [nums[mid], nums[high]] = [nums[high], nums[mid]];
        high--;
      }
    }
  }

  static sortColors1(nums) {
    return null;
  }
}

// Example usage:
const nums = [2, 0, 2, 1, 1, 0];
const nums1 = [2, 0, 2, 1, 1, 0];
SortColors.sortColors(nums);
SortColors.sortColors1(nums1);
console.log("Sorted Colors:", nums);
console.log("Sorted Colors2:", nums1);
