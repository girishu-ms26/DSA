package LeetCode;

public class PalindromeNumber {
    public static void main(String[]args) {
        int x = 122;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        StringBuilder sb = new StringBuilder(y);
        String z = String.valueOf(sb.reverse());
        if(y.equals(z)){
            return true;
        }
        return false;
    }
}
