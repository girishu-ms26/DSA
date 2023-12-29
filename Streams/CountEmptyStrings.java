package Streams;

import java.util.Arrays;
import java.util.List;

public class CountEmptyStrings {
    public static void main(String[]args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        strList.stream().filter(s -> s.isEmpty()).count();
    }
}
