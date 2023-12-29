package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStreamAPI {
    public static void main(String[]args) {
        List<String> names = Arrays.asList("Girishu","Anil","Raja","Ashok","Rani");
        names.stream().map(s -> s.toUpperCase()).filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
    }
}
