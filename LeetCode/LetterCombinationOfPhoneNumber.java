package LeetCode;

import java.util.*;

public class LetterCombinationOfPhoneNumber {
    static ArrayList<String> arl = new ArrayList<>();
    static String[] arr =  {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[]args) {
        String digits = "23";
        String digits1 = "";
        String digits2 = "2";
        List<String> combi = letterCombinations(digits);
        combi.forEach(System.out::println);
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return arl;
        }
        helper(0,new StringBuilder(""),digits);
        return arl;
    }


    static void helper(int index, StringBuilder s,String digits){
        // System.out.println(s);
        if(s.length() == digits.length()){
            //System.out.println(s);
            arl.add(new String(s));
            return;
        }
        int a = digits.charAt(index) - '0';
        for(int i = 0 ; i < arr[a].length() ; i++){
            s.append((arr[a].charAt(i)));
            helper(index+1,s,digits);
            s.deleteCharAt(s.length()-1);
        }
    }
}
