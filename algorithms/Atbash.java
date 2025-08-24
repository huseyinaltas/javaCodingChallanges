package algorithms;

public class Atbash {
    public static String atbash(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char mirrored = (char) ('Z' - (ch - 'A'));
                result.append(mirrored);
            } else if (Character.isLowerCase(ch)) {
                char mirrored = (char) ('z' - (ch - 'a'));
                result.append(mirrored);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String inputStr = "Hello, World!";
        String result5 = atbash(inputStr);
        System.out.println("Atbash cipher for input \"" + inputStr + "\": " + result5);
    }
}