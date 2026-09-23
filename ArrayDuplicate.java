import java.util.*;
public class ArrayDuplicate {

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter size of the 2 arrays (n , m) :");
int n=sc.nextInt();
int m=sc.nextInt();
System.out.println("enter values of array1: ");
int a[]=new int[n];
int b[]=new int[m];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

System.out.println("enter values of array2: ");
for(int i=0;i<m;i++)
{
	b[i]=sc.nextInt();
}
ArrayList<Integer> res=new ArrayList<>();
for(int i=0;i<n;i++)
{
	if(!res.contains(a[i]))
		res.add(a[i]);
}

for(int i=0;i<n;i++)
{
	if(!res.contains(b[i]))
		res.add(b[i]);
}
Collections.sort(res);
for(int x:res)
{
System.out.print(" "+x);
}
sc.close();
}
}
    

