package LeetCode;

import java.util.*;

public class LongestCommonPrefix_1 {
    public static void main(String[]args) {
        String[] s = {"flower","flow","flight"};
        String[] s1 = {"dog","racecar","car"};
        String[] s2 = {"ab", "a"};
        String[] s3 = {"reflower","flow","flight"};
        String[] s4 = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(s2));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if(strs==null || strs.length==0 || strs[0].length()<1){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int count = 0;
        for(int i=1;i<=first.length();i++) {
            if(count<=last.length()-1 && first.charAt(count) == last.charAt(count)) {
                count++;
            }
        }

        return last.substring(0,count);
    }
}
