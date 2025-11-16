package Interview;

import java.util.Arrays;
import java.util.List;

public class StringProblem {
    public static void main(String[] args) {
        String s = "Ram is a good boy"; // yob doog a si maR

        StringBuilder builder = new StringBuilder(s);
        builder = builder.reverse();
        List<StringBuilder> strings = Arrays.stream(builder.toString().split(" ")).map(StringBuilder::new).toList();
        strings.forEach(e -> System.out.print(e.append(" ")));
    }
}
