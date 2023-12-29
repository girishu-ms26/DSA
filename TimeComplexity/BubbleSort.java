package TimeComplexity;

import java.util.*;

public class BubbleSort {
    public static void main(String[]args) {
        int[] array = {4,5,3,2,3,1,0};
        int[] arraySorted = bubbleSort(array);
        Arrays.stream(arraySorted).forEach(System.out::println);
    }
    public static int[] bubbleSort(int[] array) {
        int n = array.length;

        for(int i=0;i<n;i++) {
            int temp = array[i];
            for(int j=i+1;j<n;j++) {
                if(temp > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
