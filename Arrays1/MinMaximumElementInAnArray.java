package Arrays1;

class pair {
    long first,second;
    public pair(long first, long second){
        this.first = first;
        this.second = second;
    }
}

public class MinMaximumElementInAnArray {
    public static void main(String[] args) {
    long[] arr = {100,1,5,999,200,50,9999,1234};
    System.out.println(maximumElement(arr).first +" "+maximumElement(arr).second);
    }
    public static pair maximumElement(long[] arr) {
        long min = arr[0];
        long max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        pair minMax = new pair(min,max);
        return minMax;
    }
}
