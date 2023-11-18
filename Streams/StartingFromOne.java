package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StartingFromOne {
    public static void main(String[]args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        startingFromOne(integerList);
    }

    public static void startingFromOne(List<Integer> myList) {
//        myList.stream().map(i -> i+"").filter(i -> i.startsWith("1")).forEach(System.out::println);
        HashSet<Integer> hashSet = new HashSet<>();
//        myList.stream().filter(i -> !hashSet.add(i)).forEach(System.out::println);
//        myList.stream().count();
//        System.out.println(myList.stream().max(Integer::compare).get());

    }
}
