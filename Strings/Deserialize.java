package Strings;

import java.util.ArrayList;

public class Deserialize {
    public static void main(String[]args){
        String A = "mxxxzclaql10~omttepvukq10~sckhqgagqt10~miaufqvumh10~jndrqnllah10~wqlithzmfi10~oczafaqcrz10~lnubllvcsq10~rzngzhllmw10~ntpvbeyxnk10~";
        String B = "ihlauh6~wvpakl6~gkyxfa6~yssssk6~ilrssd6~ogtlqb6~";
        ArrayList<String> s = deserialize(B);
        for(int i=0;i<=s.size()-1;i++){
            System.out.println(s.get(i));
        }
    }

    public static boolean isValidIndex(String A, int index) {
        return index >= 0 && index < A.length();
    }
    public static ArrayList<String> deserialize(String A) {
        ArrayList<String> ans = new ArrayList<>();
        A = A.replace("~","");
        int index = 0;
        String temp = "";
        int count = 0;
        for(int i=0;i<=A.length()-1;i++){
            char a = A.charAt(i);
            if(Character.isDigit(a)){
                if(index==0){
                    temp = A.substring(index,i);
                    ans.add(temp);
                } else {
                    temp = A.substring(index, i);
                    ans.add(temp);
                }
                for(int j=i;j<=A.length()-1;j++){
                    if(Character.isDigit(A.charAt(j))){
                        count++;
                    }
                    if(!Character.isDigit(A.charAt(j))){
                        break;
                    }
                }
                    i = i+count-1;
                    index = i+1;
                    temp = "";
                    count = 0;
                }
            }
        return ans;
    }
}
