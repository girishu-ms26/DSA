package Strings;

import java.util.Arrays;

public class SelfPermutation {
    public static void main(String[]args){
        String A = "hhxvckftwh";
        String B = "hlxmelz";
        System.out.println(permuteStrings(A,B));
    }
    public static int permuteStrings(String A, String B) {
        char[] ch1 = A.toCharArray();
        char[] ch2 = B.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int count=0;
        if(ch1.length == ch2.length){
            for(int i=0;i<=ch1.length-1;i++){
                if(ch1[i] == ch2[i]){
                    count++;
                }
            }
            if(count==ch1.length){
                return 1;
            }
            else {
                 return 0;
            }
        }
        else {
             return 0;
        }
    }
}
