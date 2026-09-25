import java.util.*;
public class LargestElementInArray {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter size of the array");
            int n=sc.nextInt();
            int arr[] =new int[n];
            System.out.println("enter elements in the array");
            for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();

            }
            Arrays.sort(arr);
            System.out.println(arr[n-1]);
                sc.close();

    }
    
}

