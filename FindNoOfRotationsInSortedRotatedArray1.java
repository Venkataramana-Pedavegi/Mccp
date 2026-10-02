import java.util.*;
public class FindNoOfRotationsInSortedRotatedArray1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=search(arr);
        System.out.println("no of rotations:"+result);
        sc.close();
    }
    static int search(int arr[]){
        int l=0;
        int n=arr.length;
        int h=n-1;
        int mid=l+(h-l)/2;
        int prev=(mid+n-1)%n;
        int next=(mid+1)%n;
        if(arr[l]<arr[h]){
            return 0;
        }
        while(l<=h){
            if(arr[mid]>arr[next] && arr[mid]<arr[prev])
            {
                return mid;
            }
            if(arr[mid]>arr[l] ){
                l=mid+1;
            }else{
                h=mid-1;
            }

        }
        return 0;
    }
    
}
