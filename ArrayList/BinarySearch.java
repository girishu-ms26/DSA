package ArrayList;


import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //System.out.println(binarySearch(arrayList,0,arrayList.size()-1,9));
        System.out.println(iterativeBinarySearch(arrayList,2));
    }
    public static int binarySearch(List<Integer> list, int length, int listSize, int element) {
        if(listSize>=length) {
            int mid = length + (listSize - length) / 2;
            if(list.get(mid)==element){
                return mid;
            }
            if(list.get(mid)>element) {
                return binarySearch(list,length,mid-1,element);
            }
            return binarySearch(list,mid+1,listSize,element);
        }
        return -1;
    }

    public static int iterativeBinarySearch(List<Integer> list, int element) {
        int mid = list.size()/2;
        if(list.get(mid)==element){
            return mid;
        }
        if(list.get(mid)>element) {
            for(int i=0;i<=mid-1;i++) {
                if(element == list.get(i)){
                    return i;
                }
            }
        }
            for(int i=mid+1;i<=list.size()-1;i++) {
                if(element == list.get(i)){
                    return i;
                }
            }
        return -1;
    }
}