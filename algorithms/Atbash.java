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
        String result = atbash(inputStr);
        String result1 = atbash1(inputStr);
        System.out.println("Atbash cipher for input \"" + inputStr + "\": " + result);
        System.out.println("Atbash cipher for input \"" + inputStr + "\": " + result1);
        // output: Atbash cipher for input "Hello, World!": Svool, Dliow!
        // int a = 'a';97
        // int z = 'z';122
        // int A = 'A';65 B 66
        // int Z = 'Z';90 Y 89
    }

    public static String atbash1(String input) {
        return null;
    }
}