package java17;

public class RecordTest {

    public record Person(String name, int age) {

    }

    public static void main(String[] args) {
        Person p = new Person("Girishu M S", 26);
        System.out.println(p.name);
        String s = "";
        switch (s) {
            case "1":
                System.out.println("TRUE");
                break;
            case "2":
                System.out.println("FALSE");
                break;
            default:
                System.out.println("DEFAULT");
                break;
        }

        boolean result = switch (s) {
            case "1" -> true;
            case "2" -> false;
            default -> throw new RuntimeException("TEST");
        };
    }

}
