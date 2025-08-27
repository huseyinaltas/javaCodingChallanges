package algorithms;

import java.util.*;

public class RomanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int prev = 0;
        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = romanMap.get(s.charAt(i));
            if (curr < prev)
                total -= curr;
            else
                total += curr;
            prev = curr;
        }
        return total;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int result = romanToInt(roman);
        int result1 = romanToInt1(roman);
        System.out.println("Roman numeral \"" + roman + "\" converted to integer: " + result);
        System.out.println("Roman numeral \"" + roman + "\" converted to integer: " + result1);
        // output: Roman numeral "MCMXCIV" converted to integer: 1994
    }

    public static int romanToInt1(String s) {
        return 0;
    }
}