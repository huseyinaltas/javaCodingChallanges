class TwoSum {
  static twoSum(nums, target) {
    const map = new Map();
    for (let i = 0; i < nums.length; i++) {
      const complement = target - nums[i];
      if (map.has(complement)) {
        return [map.get(complement), i];
      }
      map.set(nums[i], i);
    }
    throw new Error("No two sum solution");
  }

  static twoSum1(nums, target) {
    throw new Error("target is not matched");
  }
}

// Example usage:
const nums = [2, 7, 11, 15];
const target = 9;
try {
  const result = TwoSum.twoSum(nums, target);
  console.log(
    `Indices of the two numbers that add up to ${target}: [${result}]`
  );
} catch (e) {
  console.log(e.message);
}
try {
  const result1 = TwoSum.twoSum1(nums, target);
  console.log(
    `Indices of the two numbers that add up to ${target}: [${result1}]`
  );
} catch (e) {
  console.log(e.message);
}
