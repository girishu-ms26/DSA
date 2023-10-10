package Strings;

public class VowelandConsonantSubstrings {
    public static void main(String[]args){
        String A = "inttnikjmjbemrberk";
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        int total = 0;
        int vowels = 0;
        int consonents = 0;
        for (int i=0;i<A.length();i++){
            if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u')
                vowels++;
            else consonents++;
        }
        total = (vowels * consonents) % 1000000007;
        return total;
    }
}