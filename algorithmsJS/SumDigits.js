class SumDigits {
  static sumDigits(num) {
    while (num > 9) {
      let total = 0;
      while (num !== 0) {
        total += num % 10;
        num = Math.floor(num / 10);
      }
      num = total;
    }
    return num;
  }

  static sumDigits1(num) {
    return null;
  }
}

// Example usage:
const num = 123456;
const total = SumDigits.sumDigits(num);
const total1 = SumDigits.sumDigits1(num);
console.log(`Sum of digits of number ${num}: ${total}`);
console.log(`Sum of digits of number ${num}: ${total1}`);
