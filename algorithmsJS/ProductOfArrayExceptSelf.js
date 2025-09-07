class ProductOfArrayExceptSelf {
  static productExceptSelf(nums) {
    const result = [];
    for (let i = 0; i < nums.length; i++) {
      let total = 1;
      for (let j = 0; j < nums.length; j++) {
        if (i !== j) total *= nums[j];
      }
      result[i] = total;
    }
    return result;
  }

  static productExceptSelf1(nums) {
    return null;
  }
}

// Example usage:
const nums = [1, 2, 3, 4];
const result = ProductOfArrayExceptSelf.productExceptSelf(nums);
console.log(result.join(" "));
const result1 = ProductOfArrayExceptSelf.productExceptSelf1(nums);
if (result1) console.log(result1.join(" "));
