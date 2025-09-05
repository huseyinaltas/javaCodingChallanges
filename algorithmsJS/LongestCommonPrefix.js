class LongestCommonPrefix {
  static longestCommonPrefix(strs) {
    if (!strs || strs.length === 0) return "";
    let prefix = strs[0];
    for (let s of strs) {
      while (!s.startsWith(prefix))
        prefix = prefix.substring(0, prefix.length - 1);
    }
    return prefix;
  }

  static longestCommonPrefix1(strs) {
    return null;
  }
}

// Example usage:
const testStrs = ["flower", "flow", "flight"];
const prefix = LongestCommonPrefix.longestCommonPrefix(testStrs);
const prefix1 = LongestCommonPrefix.longestCommonPrefix1(testStrs);
console.log(
  `Longest common prefix for ${JSON.stringify(testStrs)}: "${prefix}"`
);
console.log(
  `Longest common prefix for ${JSON.stringify(testStrs)}: "${prefix1}"`
);
