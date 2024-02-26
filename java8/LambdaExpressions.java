package java8;

@FunctionalInterface
interface Test {
    int testing(int a);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        Test testingLambda = (a)-> a+a+a;
        System.out.println(testingLambda.testing(5));
    }
}
