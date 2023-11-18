package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountOfEachCharacter {
    public static void main(String[]args) {
        String s = "geeksforgeeks";
        countOfEachCharater(s);
    }
    public static void countOfEachCharater(String s) {
        List<Character> characters = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            characters.add(s.charAt(i));
        }
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i),1);
            } else {
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
        }
        System.out.println(hashMap.entrySet());
    }
}
