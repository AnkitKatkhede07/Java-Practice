import java.util.Scanner;
public class SumArrays
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a Size of Element");
	 int size=sc.nextInt();
	 int a[][]=new int[size][size];
	 int b[][]=new int[size][size];
	 System.out.println("Enter a Array of First Element:");
	 for(int i=0;i<a.length;i++)
	 {
	   for(int j=0;j<a[i].length;j++)
	   {
	    a[i][j]=sc.nextInt();
	   }
	 }
	 System.out.println("Display matrix A");
	 for(int i=0;i<a.length;i++)
	 {
	    for(int j=0;j<a[i].length;j++)
		{
		  System.out.print(" "+a[i][j]);
		}
		System.out.println();
	 }
	 System.out.println("Enter a Array of Secound Element:");
	 for(int i=0;i<b.length;i++)
	 {
	    for(int j=0;j<b[i].length;j++)
		{
	      b[i][j]=sc.nextInt();
	    }
	 }
	 System.out.println("Display matrix B");
	 for(int i=0;i<b.length;i++)
	 {
	    for(int j=0;j<b[i].length;j++)
		{
		  System.out.print(" "+b[i][j]);
		}
		System.out.println();
	 }
	 System.out.println("this arrays on display");
	 int c[][]=new int[size][size];
	 for(int i=0;i<c.length;i++)
	 {    
	    for(int j=0;j<c[i].length;j++)
		{
		   c[i][j]=a[i][j]+b[i][j]; 
		}
	 }
	 for(int i=0;i<c.length;i++)
	 {
	    for(int j=0;j<c[i].length;j++)
		{
		  System.out.print(" "+c[i][j]);
		}
		System.out.println();
	 }
  }
}