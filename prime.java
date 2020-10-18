import java.util.*;
class prime
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int x = sc.nextInt();
    System.out.println("Enter the nth number");
    int n = sc.nextInt();
    int f,c=0;
    for(int i=x+1; i<=10000; i++)
    {
      f=0;
      for(int j=1; j<=i; j++)
      {
        if(i%j==0)
        f++;
      }
      if(f==2)
      c++;
      if(c==n)
      {
        System.out.println(i);
        break;
      }

    }
  }
}
