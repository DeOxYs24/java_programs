import java.util.Scanner;
public class Main
{
 
public static void Sort(int arr[])
{   int n=arr.length;
    for(int j=0;j<n;j++){
        int min=arr[j],minindex=j;
        for(int i=j+1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
        }
        int temp=arr[j];
        arr[j]=arr[minindex];
        arr[minindex]=temp;
    }
}
public static void printarray(int a[])
{
for(int i=0; i < a.length; i++)
{
 
System.out.print(a[i]+" ");
}
 
}
public static void main(String[] args) 
{
int n, res,i;
Scanner s = new Scanner(System.in);
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