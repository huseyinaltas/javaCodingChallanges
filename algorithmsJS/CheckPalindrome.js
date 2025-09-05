class CheckPalindrome {
  static checkPalindrome(input) {
    let left = 0;
    let right = input.length - 1;
    while (left < right) {
      if (input[left] !== input[right]) return false;
      left++;
      right--;
    }
    return true;
  }

  static checkPalindrome1(input) {
    return false;
  }
}

// Example usage:
const testStr1 = "madam";
const isPalindrome = CheckPalindrome.checkPalindrome(testStr1);
const isPalindrome1 = CheckPalindrome.checkPalindrome1(testStr1);
console.log(`Is "${testStr1}" a palindrome? ${isPalindrome}`);
console.log(`Is "${testStr1}" a palindrome? ${isPalindrome1}`);
