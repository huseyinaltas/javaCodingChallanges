class SortArray {
  static sortArray(nums) {
    let temp = 0;
    let swapped = false;
    for (let i = 0; i < nums.length; i++) {
      for (let j = i; j < nums.length; j++) {
        if (nums[i] >= nums[j]) {
          temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
          swapped = true;
        }
      }
      if (!swapped) break;
    }
    console.log(nums);
  }

  static sortArray1(nums) {}
}

// Example usage:
const nums = [5, 2, 3, 1];
const nums1 = [5, 2, 3, 1];
console.log("Before sorting:", nums);
console.log("Before sorting:", nums1);
SortArray.sortArray(nums);
SortArray.sortArray1(nums1);
console.log("After sorting:", nums);
console.log("After sorting:", nums1);
