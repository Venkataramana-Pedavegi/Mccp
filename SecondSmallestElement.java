import java.util.*;
public class SecondSmallestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int smallest=arr[0];
        int ssmallest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=smallest){
                ssmallest=arr[i];
                break;
            }
        }
        System.out.println(" smallest element:"+smallest);
        System.out.println("Second smallest element:"+ssmallest);
        sc.close();
    }
    
}
