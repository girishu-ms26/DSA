package Streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class StreamsFlatMap {
    public static void main(String[]args) {
        List<List<String>> myList = Arrays.asList(
            Arrays.asList("a"),
            Arrays.asList("b")
        );

//        myList.stream().flatMap(Collection::stream).forEach(i -> System.out.println(i.toUpperCase()));
//        myList.stream().flatMap(Collection::stream).forEach(System.out::println);

//        myList.stream().flatMap(Collection::stream).forEach(System.out::println);
        char[] chars = new char[]{'a','a','b','b','c'};
        StringBuilder stringBuilder = new StringBuilder();
        String.valueOf(chars)
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()))
                .forEach((k,v) -> stringBuilder.append(k).append(v));
        System.out.println(stringBuilder);
    }
    interface HasWater {
        public boolean isBlue();
        void wet();
    }
    interface IsSalty {
        static final String colout = "co";
        Boolean isBlue();
        public void wet();
    }
}
