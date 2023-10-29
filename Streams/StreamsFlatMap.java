package Streams;

import java.util.*;

public class StreamsFlatMap {
    public static void main(String[]args) {
        List<List<String>> myList = Arrays.asList(
            Arrays.asList("a"),
            Arrays.asList("b")
        );

//        myList.stream().flatMap(Collection::stream).forEach(i -> System.out.println(i.toUpperCase()));
//        myList.stream().flatMap(Collection::stream).forEach(System.out::println);

        myList.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
