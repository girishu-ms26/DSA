package Int;

public class EvenOrOdd {
    public static void main(String[]args) {
        int number = 3;
        System.out.println(evenOrOdd(number));
    }
    public static String evenOrOdd(int number){
        if(number % 2 == 0){
            return "even";
        } else {
            return "odd";
        }
    }
}
