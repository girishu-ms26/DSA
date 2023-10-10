package Streams;

import java.util.*;

public class AverageOfIntegers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        System.out.println("List of numbers: " + nums);
        double average = nums.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Average value of the said numbers: " + average);
    }
}
