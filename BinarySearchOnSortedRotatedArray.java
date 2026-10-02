import java.util.*;
public class BinarySearchOnSortedRotatedArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter sort value");
        int x=sc.nextInt();
        int result=search(arr, n, x);
        System.out.println("Index" +result);
        sc.close();

    }
    static int search(int arr[], int n,int x){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==x){
                return i;
            }

        }
        return -1;
        }
    }

    

