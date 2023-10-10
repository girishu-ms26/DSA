package Arrays1;

public class LargestArray {

    public static void main(String[]args){
        int arr[] = {12, 13, 1, 10, 34, 10};
        System.out.println(largestElement(arr));
    }

    public static int largestElement(int[] arr){
        int temp = arr[0];
        for(int i=0;i<= arr.length-1;i++){
            if(temp < arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}
