package Strings;

public class StringAndItsFrequency {

    public static void main(String[]args){
        String A = "w";
        String res = solve(A);
        System.out.println(res);
    }

    public static String solve(String A) {
        String ans = "";
        String temp = "";
        int count = 0;
        char a = A.charAt(0);
        if(A.length()==1){
            return A=A+1;
        }
        for(int i=0;i<=A.length()-1;i++){
            if(!Character.isDigit(A.charAt(i))){
                a = A.charAt(i);
            }
            for(int j=0;j<=A.length()-2;j++){
                if(j==0){
                    if(a == A.charAt(j)){
                        count++;
                        temp = String.valueOf(a) + count;
                    }
                }
                if(!Character.isDigit(A.charAt(j+1))) {
                    if (a == A.charAt(j + 1)) {
                        count++;
                        temp = String.valueOf(a) + count;
                    }
                }
            }
            if(count>=1){
                A = A.replace(a,'0');
            }
            count=0;
            ans = ans+temp;
            temp="";
        }
        return ans;
    }
}