package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[]args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(1);

        List<Integer> ones = integers.stream().filter(i -> i==1).collect(Collectors.toList());

        ones.stream().forEach(i -> System.out.println(i));
    }
}
