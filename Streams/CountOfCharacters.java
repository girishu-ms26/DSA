package Streams;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOfCharacters {
    public static void main(String[]args) {
        String s = "abcdefffghh";
        Map<Character,Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        for(Map.Entry key : map.entrySet()){
            System.out.println(key.getKey()+" "+key.getValue());
        }
    }
}
