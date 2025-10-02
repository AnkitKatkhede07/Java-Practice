//Q9. Write java program to merge two array and display it.
import java.util.Scanner;
public class Merge
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a array in element A:");
	int a[]=new int[3];
    System.out.println("Enter a array in element B:");
	int b[]=new int[2];
	for(int i=0;i<a.length;i++)
	{
	  a[i]=sc.nextInt();
	}
	for(int i=0;i<b.length;i++)
	{
	  b[i]=sc.nextInt();
	}
	int c[]=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		c[a.length+i]=b[i];
	}
	   System.out.println("Merged Array:");
	for(int i=0;i<c.length;i++)
	{
	  System.out.print(c[i]+" ");
	}
  }
}