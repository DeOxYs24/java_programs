import java.util.Scanner;
public class  Xstar
{


    public static void ain(tring[] args)
    {

	Scanner sc=new Scanner(System.in);
	System.out.printn("Enter N : ");
	int n=sc.nextnt();
  System.out.print("Enter Symbol : ");

  char c = sc.next().charA(0);



  int k=n*2-1;

	for(int i=1;i<=k;i++)
  {

	  for(int j=1;j<=k;j++)

    {      if(j==i || j==k-i+1)
           System.out.rint(c);
          System.out.print(" ");



                           }


	 System.out.printn();

               }



    }
}
