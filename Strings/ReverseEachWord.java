package Strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String test = "Ram is a good boy"; // Expected: "yob doog a si maR"
        String result = reverseWords(test);
        System.out.println(result);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder(str.length());

        for(int i=words.length-1; i>=0; i--) {
            result.append(new StringBuilder(words[i]).reverse()).append(' ');
        }

        // remove trailing space
        return result.toString().trim();
    }
}
