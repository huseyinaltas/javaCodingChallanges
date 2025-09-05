class Atbash {
  static atbash(input) {
    let result = "";
    for (let ch of input) {
      if (ch >= "A" && ch <= "Z") {
        let mirrored = String.fromCharCode(
          "Z".charCodeAt(0) - (ch.charCodeAt(0) - "A".charCodeAt(0))
        );
        result += mirrored;
      } else if (ch >= "a" && ch <= "z") {
        let mirrored = String.fromCharCode(
          "z".charCodeAt(0) - (ch.charCodeAt(0) - "a".charCodeAt(0))
        );
        result += mirrored;
      } else {
        result += ch;
      }
    }
    return result;
  }

  static atbash1(input) {
    return null;
  }
}

// Example usage:
const inputStr = "Hello, World!";
const result = Atbash.atbash(inputStr);
const result1 = Atbash.atbash1(inputStr);
console.log(`Atbash cipher for input "${inputStr}": ${result}`);
console.log(`Atbash cipher for input "${inputStr}": ${result1}`);
