package Arrays1;

import java.util.Arrays;
import java.util.List;

public class TwoSorts {
    // Sort first half in ascending and second half in descending

    public static void main(String[]args){
        Integer[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        Integer[] res = fun(arr);
        for(int i=0;i<=res.length-1;i++){
            System.out.println(res[i]);
        }
    }

    public static Integer[] fun(Integer[] arr){
        List<Integer> tempArrayList = Arrays.asList(arr);
        int len = tempArrayList.size();
        Integer[] res = new Integer[arr.length];
        Integer[] asc = new Integer[arr.length/2];
        Integer[] dsc = new Integer[arr.length/2];
        for(int i=0;i<=len/2-1;i++){
            asc[i] = tempArrayList.get(i);
        }
        int index = 0;
        for(int i=len/2;i<=len-1;i++){
            dsc[index] = tempArrayList.get(i);
            index++;
        }
        Arrays.sort(asc);
        Arrays.sort(dsc);

        for(int i=0;i<=asc.length-1;i++){
            res[i] = asc[i];
        }
        for(int i=dsc.length-1;i>=0;i--){
            res[res.length-1-i] = dsc[i];
        }
        return res;
    }
}
