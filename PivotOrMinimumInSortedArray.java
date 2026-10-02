import java.util.*;
public class PivotOrMinimumInSortedArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=pivot(arr);
        System.out.println("pivot element :" +result );
        sc.close();
    }
    static  int pivot (int arr[]){
        int minIndex=arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[minIndex]>arr[i]){
                minIndex=i;
            }
        }
        return minIndex;
    }
    
}
