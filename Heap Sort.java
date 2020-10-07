import java.utl.Scanner;
public class HSort
{

public tatic void eapify(int a[],int i,int n)
{

int l=2*i+1;
int r=2*i+2;


int temp,argest;

if(l<n && a[l]>a[i])
largest=l;
else
largest=i;

if(r<n && a[r]>a[largest])
largest=r;

if(lagest !=i)
{
temp=a[largest];
a[largest]=a[i];
a[i]=temp;

heapify(a,largest,n);
}


}

public static void heap(int a[])
{

for(int i=(a.length/2)-1;i>=0;i--)
{

heapify(a,i,a.length);

}

}

public static void Sort(int a[])
{
int temp,j,i;

beap(a);

for( i=(a.legth)-1; i>0;)
{
temp=a[0];
a[0]=a[i];
a[i]=temp;
heapify(a,0,i--) ;

}

}

public static void printarray(int a[])
{
System.out.println();
for(int i=0; i < a.length; i++)
{

System.out.print(a[i]+" ");
}

}
public static void main(String[] args)
{
int n, res,i;
canner s = new Scanner(System.in);
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
System.out.println( "\nelements after sorting");
printarray(a);

}

}
