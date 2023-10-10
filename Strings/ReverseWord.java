package Strings;

public class ReverseWord {
    public static void main(String[]args){
        String test = "Geeks";
        reverseWord(test);
    }
    public static String reverseWord(String str) {
        char firsChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
//        str = str.trim().substring(1);
        str = str.replaceFirst(str.substring(0),str.substring(str.length()-1));
        System.out.println(str);
        return str;
    }
}
