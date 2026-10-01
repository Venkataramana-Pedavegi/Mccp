import java.util.*;
public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp=a[0];
        for(int i=1;i<n;i++){
            a[i-1]=a[i];
        }
        a[n-1]=temp;
        System.out.println("after rotation");
        System.out.println(Arrays.toString(a));
        sc.close();

    }
}

    

