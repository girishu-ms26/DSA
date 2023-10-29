package Int;

public class ReverseInteger {
    public static void main(String[]args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        int revnum=0;
        int lastdigit=0;
        while(x <0)
        {
            lastdigit=x%10;
            revnum=(revnum*10)+ lastdigit;
            x=x/10;

        }
        while(x >0)
        {
            lastdigit=x%10;
            revnum=(revnum*10)+ lastdigit;
            x=x/10;

        }

        if (revnum > Integer.MAX_VALUE || revnum  < Integer.MIN_VALUE)
        {
            revnum=0;
        }


        return  (int)revnum;
    }
}
