import java.util.*;
public class LargestElementOfArray1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("enter the elements in the array");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();

        }
        int largest=arr[0];
        for(int i=0;i<n-1;i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
        }
        System.out.println(+largest);
        sc.close();
    }
    
}
