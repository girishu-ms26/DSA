package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamsMap {
    public static void main(String[]args) {
        List<String> myList = new ArrayList<>();
        myList.add("a");
        myList.add("b");

        myList.stream().map(String::toUpperCase).forEach(i -> System.out.println(i));
        myList.stream().map(i -> i.toLowerCase()).forEach(System.out::println);
    }
}
