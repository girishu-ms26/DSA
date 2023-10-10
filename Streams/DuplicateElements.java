package Streams;

import java.util.*;

public class DuplicateElements {
    public static void main(String[]args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> setOfIntegers = new HashSet<>();
        myList.stream()
                .filter(n -> !setOfIntegers.add(n))
                .forEach(System.out::println);
    }
}
