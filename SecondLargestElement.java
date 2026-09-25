import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter size of the array");
        for(int i=0;i<n-1;i++){

             arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int largest=arr[n-1];
        int sLargest=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                 sLargest=arr[i];
                 break;
            }
        }
        System.out.println("Second largest element is:"+sLargest);
          sc.close();
    }
    
}
