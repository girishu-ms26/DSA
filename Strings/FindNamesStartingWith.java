package Strings;

import java.util.Arrays;
import java.util.List;

public class FindNamesStartingWith {
    public static void main(String[]args){
        List<String> names = Arrays.asList("Anurag","Aman","Ram","Raju");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    }
}
