package DSAProblems;

import java.util.Arrays;

public class FindLargestThreeElements {
    public static void main(String[]args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        Arrays.stream(function(arr)).forEach(element -> System.out.print(element+" "));
    }
    public static int[] function(int[] arr) {
        Arrays.sort(arr);
        int res[] = new int[3];
        res[0] = arr[arr.length-1];
        res[1] = arr[arr.length-2];
        res[2] = arr[arr.length-3];
        return res;
    }
}
