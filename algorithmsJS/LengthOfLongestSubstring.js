class LengthOfLongestSubstring {
  static lengthOfLongestSubstring(s) {
    const charSet = new Set();
    let left = 0,
      right = 0,
      maxLength = 0;
    while (right < s.length) {
      if (!charSet.has(s[right])) {
        charSet.add(s[right]);
        right++;
        maxLength = Math.max(maxLength, right - left);
      } else {
        charSet.delete(s[left]);
        left++;
      }
    }
    return maxLength;
  }

  static lengthOfLongestSubstring1(s) {
    return 0;
  }
}

// Example usage:
const input = "abcbbcbb";
const result = LengthOfLongestSubstring.lengthOfLongestSubstring(input);
const result1 = LengthOfLongestSubstring.lengthOfLongestSubstring1(input);
console.log(
  `Length of longest substring without repeating characters for input "${input}": ${result}`
);
console.log(
  `Length of longest substring without repeating characters for input "${input}": ${result1}`
);
