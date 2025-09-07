class IsValidParentheses {
  static isValid(s) {
    const stack = [];
    const mapping = {
      "}": "{",
      "]": "[",
      ")": "(",
    };
    for (let c of s) {
      if (Object.values(mapping).includes(c)) stack.push(c);
      else if (stack.length === 0 || mapping[c] !== stack.pop()) {
        return false;
      }
    }
    return stack.length === 0;
  }

  static isValid1(s) {
    return false;
  }
}

// Example usage:
const testStr5 = "{[()]}";
const isValidResult = IsValidParentheses.isValid(testStr5);
const isValidResult1 = IsValidParentheses.isValid1(testStr5);
console.log(`Is "${testStr5}" a valid bracket sequence? ${isValidResult}`);
console.log(`Is "${testStr5}" a valid bracket sequence? ${isValidResult1}`);
