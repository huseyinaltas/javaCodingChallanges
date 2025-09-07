class TopKFrequent {
  static topKFrequent(nums, k) {
    const frequencyMap = new Map();
    for (let num of nums) {
      frequencyMap.set(num, (frequencyMap.get(num) || 0) + 1);
    }
    const topK = Array.from(frequencyMap.entries())
      .sort((a, b) => b[1] - a[1])
      .slice(0, k)
      .map((entry) => entry[0]);
    return topK;
  }

  static topKFrequent1(nums, k) {
    return null;
  }
}

// Example usage:
const nums = [1, 1, 1, 2, 2, 3, 3, 3];
const k = 2;
const topK = TopKFrequent.topKFrequent(nums, k);
const topK1 = TopKFrequent.topKFrequent1(nums, k);
console.log(`Top ${k} frequent elements in ${JSON.stringify(nums)}:`, topK);
console.log(`Top ${k} frequent elements in ${JSON.stringify(nums)}:`, topK1);
