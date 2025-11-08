package Interview;

public final class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person("test",2);
        p.setName("1");
        System.out.println(p.name);
    }
}
