import java.util.*;
public class PowerOfXToN {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        System.out.println("enter x value");
        int x=sc.nextInt();
        int ans=power(x,n);
        System.out.println(+ans);
        sc.close();
    }
    static int power(int x,int n){
        int result=1;
        for(int i=0;i<n;i++){
            result=result*x;
            System.out.println(+ result);
        }
            return result;

    }
    
    
}

