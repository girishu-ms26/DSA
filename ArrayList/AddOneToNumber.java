package ArrayList;

import javafx.util.converter.BigIntegerStringConverter;

import java.math.BigInteger;
import java.util.ArrayList;

public class AddOneToNumber {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        System.out.println(plusOne(list));
    }
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> returnList = new ArrayList<>();
        if(A.size()==1 && A.get(0)==0) {
            returnList.add(1);
            return returnList;
        }
        String res = "";
        BigInteger sum ;
        for(int i=0;i<A.size();i++){
            res = res + A.get(i);
        }
        System.out.println(res);
        BigIntegerStringConverter conv = new BigIntegerStringConverter();
        sum = conv.fromString(res);
        sum = sum.add(BigInteger.ONE);
        System.out.println(sum);
        res = "";
        res = String.valueOf(sum);
        for(int i=0;i<res.length();i++){
            returnList.add(i,Integer.parseInt(String.valueOf(res.charAt(i))));
        }
        return returnList;
    }
}
