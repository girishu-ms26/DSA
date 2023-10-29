package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubString {
    public static void main(String[]args) {
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkew";
        String s3 = " ";
        String s4 = "";
        String s5 = "au";
        String s6 = "aab";
        String s7 = "abba";
        String s8 = "xxzqi";
        String s9 = "dvdf";
        String s10 = "ohomm";
        System.out.println("0 " + lengthOfLongestSubstring(s));
        System.out.println("1 " + lengthOfLongestSubstring(s1));
        System.out.println("2 " + lengthOfLongestSubstring(s2));
        System.out.println("3 " + lengthOfLongestSubstring(s3));
        System.out.println("4 " + lengthOfLongestSubstring(s4));
        System.out.println("5 " + lengthOfLongestSubstring(s5));
        System.out.println("6 " + lengthOfLongestSubstring(s6));
        System.out.println("7 " + lengthOfLongestSubstring(s7));
        System.out.println("8 " + lengthOfLongestSubstring(s8));
        System.out.println("9 " + lengthOfLongestSubstring(s9));
        System.out.println("10 " + lengthOfLongestSubstring(s10));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }

}
