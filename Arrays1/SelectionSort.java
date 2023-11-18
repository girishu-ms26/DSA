package Arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String args[])
    {
        int arr[] = {64,25,12,22,11};
        sort(arr);
    }
    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int minIndex = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
