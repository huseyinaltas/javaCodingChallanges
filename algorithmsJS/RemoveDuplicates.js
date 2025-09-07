class RemoveDuplicates {
  static removeDuplicates(nums) {
    let indx = 1;
    let occur = 1;
    for (let i = 1; i < nums.length; i++) {
      if (nums[i] === nums[i - 1]) occur++;
      else occur = 1;
      if (occur <= 2) {
        nums[indx] = nums[i];
        indx++;
      }
    }
    console.log(nums);
    return indx;
  }

  static removeDuplicates1(nums) {}
}

// Example usage:
const numx = [1, 2, 2, 3, 3, 3, 4, 4, 4];
const rrs = RemoveDuplicates.removeDuplicates(numx);
const rrs1 = RemoveDuplicates.removeDuplicates1(numx);
console.log(`All possible duplicate: ${rrs}`);
console.log(`All possible duplicate: ${rrs1}`);
// output: All possible duplicate: 5
// remove some duplicates in-place such that each unique element appears at most
// twice.
