package algorithms;

public class CheckPalindrome {
    public static boolean checkPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testStr1 = "madam";
        boolean isPalindrome = checkPalindrome(testStr1);
        boolean isPalindrome1 = checkPalindrome1(testStr1);
        System.out.println("Is \"" + testStr1 + "\" a palindrome? " + isPalindrome);
        System.out.println("Is \"" + testStr1 + "\" a palindrome? " + isPalindrome1);
        // output: Is "madam" a palindrome? true
    }

    public static boolean checkPalindrome1(String input) {
        return false;
    }
}