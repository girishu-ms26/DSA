package Streams;

public class PermutationInString {
    public static void main(String[]args) {
        System.out.println(checkInclusion("ab","eidboaoo"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        for(int i=0;i<=s2.length()-1;i++) {
            if(s1.substring(0,1).equals(s2.substring(i,i+1))){
                if(s1.substring(1,s1.length()).equals(s2.substring(i-1,i)) ||
                        s1.substring(1).equals(s2.substring(i-1))) {
                    return true;
                }
            }
        }
        return false;
    }
}
