class RomanToInt {
  static romanToInt(s) {
    const romanMap = {
      I: 1,
      V: 5,
      X: 10,
      L: 50,
      C: 100,
      D: 500,
      M: 1000,
    };
    let prev = 0;
    let total = 0;
    for (let i = s.length - 1; i >= 0; i--) {
      const curr = romanMap[s[i]];
      if (curr < prev) total -= curr;
      else total += curr;
      prev = curr;
    }
    return total;
  }

  static romanToInt1(s) {
    return null;
  }
}

// Example usage:
const roman = "MCMXCIV";
const result = RomanToInt.romanToInt(roman);
const result1 = RomanToInt.romanToInt1(roman);
console.log(`Roman numeral "${roman}" converted to integer: ${result}`);
console.log(`Roman numeral "${roman}" converted to integer: ${result1}`);
