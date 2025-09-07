package algorithms;

public class CountLetters {

    // Method to count letters
    public static String countLetters(String s) {
        if (s == null || s.length() == 0)
            return "";

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }

            if (i + 1 == s.length()) {
                result.append(s.charAt(i)).append(count);
            }
        }

        return result.toString();
    }

    // Placeholder like your countLetters1
    public static int countLetters1(String s) {
        return 0;
    }

    // Example usage
    public static void main(String[] args) {
        String input = "aaaabbccaaaaa";
        String result = countLetters(input);
        int result1 = countLetters1(input);

        System.out.println("Count repeating characters for input \"" + input + "\": " + result);
        System.out.println("Count repeating characters for input \"" + input + "\": " + result1);
    }
}
