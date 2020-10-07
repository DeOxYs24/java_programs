public class PMtangle
{
public static void main(tring[] args)
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter N : ");
int n=sc.nextInt();
System.out.print("Enter Symbol : ");

ch c = sc.next().charAt(0);

for(it i=1;i<=n;i++)
{

for(int j1;j<=n-i;j++)

{
ystem.out.print(" ");
}
if(i==1 || i==n)
for(int j=1;j<=i*2-1;j++)

{
System.out.pint(c);
}
else
{
for(int j=1;j<=i*2-1;j++)

{
if(j=1 || j==i*2-1)
System.out.print(c);
else

System.out.print(" ");
}
}
System.out.println();

}
}
}
