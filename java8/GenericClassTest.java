package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Generic<T> {

    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return this.value;
    }
}
public class GenericClassTest {
    public static void main(String[] args) {
//        Generic<Integer> genericObject = new Generic<>();
//        genericObject.set(1);
//        System.out.println(genericObject.get());

        List<Integer> list = Arrays.asList(7,4,3,1);
        list.sort(new CustomComparator());
        list.forEach(System.out::print);
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
