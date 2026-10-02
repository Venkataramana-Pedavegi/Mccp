import java.util.*;
public class FindNoOfRotationsInSortedRotatedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=search(arr);
        System.out.println("No of rotations :" +result);

    }
    static int search(int arr[]){
        int min=arr[0];
        int index=0;
        for (int i=1;i<arr.length-1;i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        return index;
         
    }

    
}
