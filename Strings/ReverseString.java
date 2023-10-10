package Strings;

public class ReverseString {
    public static void main(String[]args) {
        String s = "Girishu";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String reversedString = "";
        for(int i=s.length()-1;i>=0;i--){
            reversedString = reversedString + s.charAt(i);
        }
        return reversedString;
    }
}
