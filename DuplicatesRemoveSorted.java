import java.util.*;
public class DuplicatesRemoveSorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(arr[i]);
        sc.close();
    }
    
}
