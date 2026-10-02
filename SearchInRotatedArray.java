import java.util.*;
public class SearchInRotatedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter search element");
        int x=sc.nextInt();
        int result= search(arr, n, x);
        System.out.println("Index" +result);
        sc.close();
    }
    static int  search (int arr[], int n, int x){
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==x){
                return m;
            }else if(arr[l]<arr[m]){
                if(x<arr[m] && x>arr[l]){
                    h=m-1;
                }else{
                    l=m+1;
                }
            }
            else{
                if(x>arr[m] && x<arr[h]){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }

        }
            return -1;




    }
    
}
