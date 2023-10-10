package Int;

public class PrimeNumber {
    public static void main(String[]args){
        int a = 10;
        primeNumber(a);
    }

    public static void primeNumber(int a){
        int count = 0;
        if(a < 2){
            System.out.println(a+" is not a prime number");
        }
        for(int i=1;i<=a;i++){
            if(a % i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println(a+ " is not a prime number");
        } else {
            System.out.println(a+ " is a prime number");
        }
    }
}
