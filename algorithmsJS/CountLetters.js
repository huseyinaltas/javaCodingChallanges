class CountLetters {
  static countLetters(s) {
    let result = "";
    let count = 1;
    for (let i = 1; i < s.length; i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        count++;
      } else {
        result = result + s.charAt(i - 1) + count;
        count = 1;
        continue;
      }
      if (i + 1 == s.length) {
        result = result + s.charAt(i - 1) + count;
        count = 1;
      }
    }
    return result;
  }

  static countLetters1(s) {
    return 0;
  }
}

// Example usage:
const input = "aaaabbccaaaaa";
const result = CountLetters.countLetters(input);
const result1 = CountLetters.countLetters1(input);
console.log(`Count repeating characters for input "${input}": ${result}`);
console.log(`Count repeating characters for input "${input}": ${result1}`);
