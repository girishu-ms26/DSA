package Strings;

import java.util.*;

public class FindTheDifference {
    public static void main(String[]args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
    public static char findTheDifference(String s, String t) {
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);
        char[] c2 = t.toCharArray();
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++) {
            if(c1[i] != c2[i]){
                return c2[i];
            }
        }
        return c2[c2.length-1];
    }
}
