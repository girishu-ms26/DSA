package Strings;

public class Palindrome {
    public static void main(String[]args){
        String A = "malayalam";
        System.out.println(isPalindrome(A));
    }
    public static int isPalindrome(String A) {
        A = A.replaceAll("[^a-zA-Z0-9]", "").replaceAll("\\s","").toLowerCase();
        StringBuilder sb = new StringBuilder(A);
        String B = String.valueOf(sb.reverse());
        if(A.equals(B)){
            return 1;
        }
        else {
             return 0;
        }
    }
}
