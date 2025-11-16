package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Girishu";
        System.out.println(recursive(s));
    }

    public static String reverseString(String s) {
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString = reversedString + s.charAt(i);
        }
        return reversedString;
    }

    public static String recursive(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        return recursive(s.substring(1)) + s.charAt(0);
    }
}
