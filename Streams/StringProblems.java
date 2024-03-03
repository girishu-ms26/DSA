package Streams;


import com.sun.jmx.snmp.internal.SnmpSubSystem;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
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
//        s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//                .entrySet().stream().forEach((v) -> System.out.println(v));

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

//        List<String> names = Arrays.asList("John", "Alice", "Bob", "Eve", "Mike", "Sara");
//        names.stream().collect(Collectors.groupingBy(String::length)).entrySet().stream().forEach(System.out::println);

        //Given a list of integers, filter out the even numbers and calculate their sum.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(numbers.stream().filter(n -> n%2==0).collect(Collectors.toList())
//                .stream().reduce((a,b) -> a+b).get());

//        Given a list of strings, convert them to uppercase, filter out the strings that start with "A," and
//        then concatenate the remaining strings into a single comma-separated string.
//        List<String> strings = Arrays.asList("Apple", "Banana", "Orange", "Avocado", "Grapes");
//        strings.stream().map(s -> s.toUpperCase()).filter(s -> !s.startsWith("A"))
//                .forEach(s -> System.out.print(s+","));

//        Given a list of objects with a numeric property, find the object with the maximum value for that property.
//        List<Integer> values = Arrays.asList(15, 8, 20, 12, 30, 18);
//        System.out.println(values.stream().max(Integer::compare).get());

//        Given a list of integers, find and print the distinct elements
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);
//        numbers.stream().distinct().forEach(System.out::println);

//        Given a list of doubles, calculate the square root of each element and collect the results into a new list.
//        List<Double> doubles = Arrays.asList(4.0, 9.0, 16.0, 25.0);
//        doubles.stream().mapToDouble(n -> Math.sqrt(n)).forEach(System.out::println);

//        Given a list of strings, filter out the strings containing the letter 'a' and sort
//        the remaining strings alphabetically.
//        List<String> strings = Arrays.asList("Apple", "Banana", "Orange", "Avocado", "Grapes");
//        strings.stream()
//                .filter(s -> s.contains("a"))
//                .sorted(Comparator.comparing(String::valueOf))
//                .forEach(System.out::println);

        //Given a list of objects with a numeric property, calculate and print the average of that property.
//        List<Integer> values = Arrays.asList(10, 15, 20, 25, 30);
//        System.out.println(values.stream().mapToDouble(n -> n).average().orElse(0.0));

        //Given a list of strings, filter out the palindromes (strings that read the same forward and backward).
//        List<String> words = Arrays.asList("level", "java", "deified", "hello", "radar");
//        words.stream()
//                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
//                .forEach(System.out::println);
    }
}
