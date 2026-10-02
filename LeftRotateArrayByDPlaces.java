import java.util.*;
public class LeftRotateArrayByDPlaces {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enter d value");
        int d=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        leftRotate(arr,n,d);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void leftRotate(int arr[], int n,int d){
        d=d % n;
        int temp[]=new int[d];
            for(int i = 0;i < d; i++){
                temp[i] =arr[i];
            }
        
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
        

    }
    
}
