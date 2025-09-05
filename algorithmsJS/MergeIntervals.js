class MergeIntervals {
  static merge(intervals) {
    if (intervals.length <= 1) return intervals;
    intervals.sort((a, b) => a[0] - b[0]);
    const merged = [];
    let current = intervals[0].slice();
    for (let i = 1; i < intervals.length; i++) {
      if (current[1] >= intervals[i][0]) {
        current[1] = Math.max(current[1], intervals[i][1]);
      } else {
        merged.push(current);
        current = intervals[i].slice();
      }
    }
    merged.push(current);
    return merged;
  }

  static merge1(intervals) {
    return null;
  }
}

// Example usage:
const inputIntervals = [
  [1, 3],
  [2, 6],
  [8, 10],
  [15, 18],
];
const result = MergeIntervals.merge(inputIntervals);
const result1 = MergeIntervals.merge1(inputIntervals);
process.stdout.write("Merged intervals: ");
for (const interval of result) {
  process.stdout.write(`[${interval[0]}, ${interval[1]}] `);
}
process.stdout.write("\nMerged intervals: ");
if (result1) {
  for (const interval of result1) {
    process.stdout.write(`[${interval[0]}, ${interval[1]}] `);
  }
}
console.log();
