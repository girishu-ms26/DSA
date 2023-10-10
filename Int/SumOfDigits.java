package Int;

public class SumOfDigits {
    public static void main(String[]args){
        int a = 1234;
        System.out.println(sumOfDigits(a));
    }
    public static int sumOfDigits(int a){
        int res = 0;
        while(a != 0){
            res =res + a % 10;
            a = a / 10;
        }
        return res;
    }
}
