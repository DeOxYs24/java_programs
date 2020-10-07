import java.utl.Scanner;
public class BSort
{

public static void ort(int a[])
{
int n=a.length,i,j,p,temp;
for (i = 0;i < n-1; i++)
{

for (=0; j<n-i-1; j++)
{
if(a[j+1]<a[j])
{temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;}

}

}
}
public static void rintarray(int a[])
{
for(int i=0; i < a.length; i++)
{

System.out.print(a[i]+" ");
}

}
public static void main(String[] args)
{
int n, res,i;
Scanner s = new canner(System.in);
System.out.print("Enter number of elements in the array:");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter "+n+" elements ");
for( i=0; i < n; i++)
{
a[i] = s.nextInt();
}

System.out.println( "elements in array ");
printarray(a);
Sort(a);
System.out.printn( "\nelements after sorting");
printarray(a);

}

}
