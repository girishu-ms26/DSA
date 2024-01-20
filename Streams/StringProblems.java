package Streams;


import com.sun.jmx.snmp.internal.SnmpSubSystem;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringProblems {
    public static void main(String[]args) {
//        //Java 8 Map functional Example: Convert String to uppercase and Join them with coma
//
//        List<String> strings = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
//        System.out.print(strings.stream().map(s -> s.toUpperCase()+",").collect(Collectors.joining()));

//        Create a List of the square of all distinct numbers
//        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
//        List<Integer> numbersList = numbers.stream().distinct().map(n -> n*n).collect(Collectors.toList());

        // Get count, min, max, sum, and the average for numbers
//        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//        primes.stream().mapToInt(n -> n).summaryStatistics();
//        primes.stream()
//                .mapToInt((x) -> x)
//                .summaryStatistics();

        // get count of each character in string
//        String s = "abcdde";
//        Map<Object, Long> map = s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->(char) c,Collectors.counting()));
//        for(Map.Entry<Object, Long> key : map.entrySet()) {
//            System.out.println(key.getKey()+" "+key.getValue());
//        }

        //find first occurrence in an arraylist whose object is names as Delhi using stream api
//        Arrays.asList("bengaluru","bangalore","mangalore","delhi","delhi")
//                .parallelStream()
//                .collect(Collectors.groupingBy(s -> s,Collectors.counting()))
//                .forEach((k,v) -> System.out.println(k+ " "+ v));

//      count of elements in array
//        Arrays.asList(1,2,3,1,3).stream()
//                .collect(Collectors.groupingBy(i -> i,Collectors.counting()));
//        sort in reverse
//        Arrays.asList(1,2,3,1,3).stream().sorted(Collections.reverseOrder());

//        join list of strings
//        Arrays.asList("bengaluru","bangalore","mangalore","delhi","delhi")
//                .stream()
//                .collect(Collectors.joining());
//        Arrays.asList("bengaluru","bangalore","mangalore","delhi","delhi")
//                .stream()
//                .reduce((a,b) -> a+b)
//                .get();

//        common elements from two arrays
//        List<Integer> list1 = Arrays.asList(1,2,3,1,3);
//        List<Integer> list2 = Arrays.asList(1,5,6,7,8);
//
//        list1.stream().filter(list2::contains).forEach(i->System.out.println(i));

//        last element of list
//        List<Integer> list1 = Arrays.asList(1,2,3,1,3);
//        list1.stream().skip(list1.size()-1).findFirst().get();
//        String s = "leetcode";
//        System.out.println(Arrays.stream(s.split(""))
//                .map(String::toLowerCase)
//                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue()==1)
//                .skip(1)
//                .findFirst()
//                .get()
//                .getKey());
//        list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream()
//                .forEach(System.out::println);
//        list1.stream().collect(Collectors.partitioningBy(n -> n==1)).entrySet().stream().forEach(System.out::println);
//        List<String> strings = Arrays.asList("Bangalore","Mangalore","Google","Delhi","Delhi");
//        strings.stream().filter(s -> s.equals("Delhi")).findFirst().get()
//                .chars().mapToObj(c -> (char) c).forEach(System.out::println);
     }
}
