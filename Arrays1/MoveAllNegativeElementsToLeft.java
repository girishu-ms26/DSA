package Arrays1;

public class MoveAllNegativeElementsToLeft {
    public static void main(String[]args){
        int[] arr = {100,-100,-5,0,-60,5,4,3,2,1,1,-50,-60,-70};
        int n = arr.length;
        allNtoleft(arr,n);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }

    public static void allNtoleft(int[] arr,int n){
        int a[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                a[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                a[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=a[i];
        }
    }
}
