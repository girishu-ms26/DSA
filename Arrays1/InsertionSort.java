package Arrays1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class InsertionSort {
    public static void main(String[]args) {
        int[] array = {10,9,8,5,1,2,3,7,0};
        int[] sortedArray = insertionSort(array);
        Arrays.stream(sortedArray).forEach(System.out::println);
    }

    private static int[] insertionSort(int[] nums) {
        int[] res = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++) {
            pq.offer(nums[i]);
        }
        int index = 0;
        while(!pq.isEmpty()){
            res[index++] = pq.poll();
        }
        return res;
    }
}
