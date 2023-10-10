package Strings;

import java.util.ArrayList;

public class Serialize {
    public static void main(String[]args){
        ArrayList<String> A = new ArrayList<>();
        A.add("scaler");
        A.add("academy");
        System.out.println(serialize(A));
    }

    public static String serialize(ArrayList<String> A) {
        String ans = "";
        for(int i=0;i<=A.size()-1;i++){
            String temp = A.get(i);
            int tempSize = temp.length();
            ans = ans+temp+tempSize+"~";
        }
        return ans;
    }
}
