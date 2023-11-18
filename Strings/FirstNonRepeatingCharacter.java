package Strings;

import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[]args) {
        String s = "aadadaad";
        System.out.println(firstNonRepeatingCharacter(s));
    }
    public static int firstNonRepeatingCharacter(String s) {
        Map<Character,Integer> hashMap = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++) {
            if(!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i),1);
            } else {
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
        }
        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }

        return -1;
    }
}
