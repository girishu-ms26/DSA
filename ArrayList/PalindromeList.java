package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeList {
    public static void main(String[]args){
        ArrayList<Integer> arrayListOfIntegers = new ArrayList<>();
        arrayListOfIntegers.add(1);
        arrayListOfIntegers.add(2);
        arrayListOfIntegers.add(2);
        arrayListOfIntegers.add(1);
        System.out.println(palin(arrayListOfIntegers));
    }

    public static int palin(ArrayList<Integer> list){
        ArrayList<Integer> palin = new ArrayList<>();
        palin.addAll(list);
        Collections.reverse(list);
        if(list.equals(palin)) {
            return 1;
        }
        return 0;
    }
}
