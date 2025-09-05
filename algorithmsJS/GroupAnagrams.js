class GroupAnagrams {
  static groupAnagrams(strs) {
    const map = new Map();
    for (let str of strs) {
      const sortedStr = str.split("").sort().join("");
      if (!map.has(sortedStr)) {
        map.set(sortedStr, []);
      }
      map.get(sortedStr).push(str);
    }
    return Array.from(map.values());
  }

  static groupAnagrams1(strs) {
    return null;
  }
}

// Example usage:
const lsts = ["eat", "tea", "tan", "ate", "nat", "bat"];
const resls = GroupAnagrams.groupAnagrams(lsts);
const resls1 = GroupAnagrams.groupAnagrams1(lsts);
console.log("All possible groups:", resls);
console.log("All possible groups:", resls1);
