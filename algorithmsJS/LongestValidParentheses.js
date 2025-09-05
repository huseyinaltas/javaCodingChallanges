class LongestValidParentheses {
  static longestValidParentheses(s) {
    const stack = [-1];
    let maxLength = 0;
    for (let i = 0; i < s.length; i++) {
      if (s[i] === "(") {
        stack.push(i);
      } else {
        stack.pop();
        if (stack.length === 0) {
          stack.push(i);
        } else {
          maxLength = Math.max(maxLength, i - stack[stack.length - 1]);
        }
      }
    }
    return maxLength;
  }

  static longestValidParentheses1(s) {
    return -1;
  }
}

// Example usage:
const testStr = "(()(()";
const result = LongestValidParentheses.longestValidParentheses(testStr);
const result1 = LongestValidParentheses.longestValidParentheses1(testStr);
console.log(
  `Longest valid parentheses length for input "${testStr}": ${result}`
);
console.log(
  `Longest valid parentheses length for input "${testStr}": ${result1}`
);
