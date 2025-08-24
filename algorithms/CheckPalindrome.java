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
        System.out.println("Is \"" + testStr1 + "\" a palindrome? " + isPalindrome);
        // output: Is "madam" a palindrome? true
    }
}