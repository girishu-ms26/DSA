package java17;

public class RecordTest {

    public record Person(String name, int age) {

    }

    public static void main(String[] args) {
        Person p = new Person("Girishu", 26);
        System.out.println(p.name);
    }

}
