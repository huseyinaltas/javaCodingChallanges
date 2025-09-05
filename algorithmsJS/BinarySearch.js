class BinarySearch {
  static search(nums, target) {
    let left = 0,
      right = nums.length - 1;
    while (left <= right) {
      let mid = left + Math.floor((right - left) / 2);
      if (nums[mid] === target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  static search1(nums, target) {
    return -1;
  }
}

// Example usage:
const nums = [-1, 0, 3, 5, 9, 12];
const target = 9;
const result = BinarySearch.search(nums, target);
const result1 = BinarySearch.search1(nums, target);
if (result !== -1) {
  console.log(`Target ${target} found at index: ${result}`);
} else {
  console.log(`Target ${target} not found in the array.`);
}
if (result1 !== -1) {
  console.log(`Target ${target} found at index: ${result1}`);
} else {
  console.log(`Target ${target} not found in the array.`);
}
