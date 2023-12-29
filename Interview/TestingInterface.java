package Interview;

public interface TestingInterface {
    default void testing() {
        System.out.print("1234");
    }
    default void testing1() {
        System.out.print("4321");
    }

}
