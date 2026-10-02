import java.util.*;
public class PivotOrMinimumInSortedArray1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=pivot(arr);
        System.out.println(+ans);
        sc.close();
    }
    static int pivot(int arr[]){
        int l=0;
        int n=arr.length;
        int h=n-1;
        
        if(arr[l]<=arr[h]){
            return l;
        }
        while(l<=h){
        int mid=l+(h-l)/2;
        int prev=(mid+n-1)%n;
        int nxt=(mid+1)%n;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[nxt] ){
                return mid;
            }
            if(arr[mid]>=arr[l]){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return -1;
    }
    
}
