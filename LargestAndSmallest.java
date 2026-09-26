import java.util.*;
public class LargestAndSmallest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int largest=arr[0];
        int sLargest=-1;
        for(int i=0;i<n-1;i++){
            if(largest<arr[i])
            {
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest && arr[i]>sLargest) {
                sLargest=arr[i];  
            }
        }
        System.out.println(+largest);
        System.out.println(+sLargest);
        int smallest=arr[0];
        int sSmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(smallest>arr[i]){
                sSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<sSmallest){
                sSmallest=arr[i];
            }
        }
        System.out.println(+smallest);
        System.out.println(+sSmallest);
        sc.close();

    }

    
}
