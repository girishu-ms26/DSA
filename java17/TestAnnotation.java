package java17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value() default "TEST";
    int priority() default 1;
}

public class TestAnnotation {

    @MyAnnotation(value = "Task 1", priority = 5)
    public static void doTask() {
        System.out.println("Doing task...");
    }

    @MyAnnotation // uses default values
    public static void doDefaultTask() {
        System.out.println("Doing default task...");
    }

    public static void main(String[] args) {
        doTask();
    }
}