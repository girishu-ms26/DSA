package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class NumbersStartingFrom1 {
    public static void main(String[]args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
//        myList.stream().map(s-> s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
//        myList.stream().map(i->i+"").filter(s->s.startsWith("1")).forEach(System.out::println);

        /*List<String> stringList = new ArrayList<>();
        for(int i=0;i<=myList.size()-1;i++) {
            stringList.add(myList.get(i).toString());
        }

        stringList.stream().filter(i -> i.startsWith("1")).forEach(System.out::println);*/

        myList.stream().map(s -> s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}
