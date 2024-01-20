package Streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MaxValue {
    public static void main(String[]args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        System.out.println(myList.stream().max(Integer::compare).get());
//        System.out.println(myList.stream().min(Comparator.comparing(Integer::valueOf)).get());
//        System.out.println(myList.stream().reduce(0, (a, b) -> a + b, Integer::sum));
//        System.out.println(myList.parallelStream().reduce(0,(a,b)->a+b, Integer::sum));
//        System.out.println(myList.parallelStream().mapToInt(Integer::valueOf).sum());
//        myList.stream().limit(Integer.valueOf(2)).forEach(System.out::println);
    }
}
