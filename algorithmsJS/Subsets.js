class Subsets {
  static subsets(nums) {
    const result = [[]];
    for (let num of nums) {
      const size = result.length;
      for (let i = 0; i < size; i++) {
        const subset = result[i].slice();
        subset.push(num);
        result.push(subset);
      }
    }
    return result;
  }

  static subsets1(nums) {
    return result;
  }
}

// Example usage:
const subsetInput = [1, 2, 3];
const subsets = Subsets.subsets(subsetInput);
const subsets1 = Subsets.subsets1(subsetInput);
console.log(
  `All possible subsets for input ${JSON.stringify(subsetInput)}:`,
  subsets
);
console.log(
  `All possible subsets for input ${JSON.stringify(subsetInput)}:`,
  subsets1
);
