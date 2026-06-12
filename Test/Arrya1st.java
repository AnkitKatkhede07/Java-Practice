import java.util.*;
public class Arrya1st
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Arrya Size");
	 int n=sc.nextInt();
	 System.out.println("Enter a Array Element");
	 int arr[]=new int[n];
	 int res[]=new int[n*2];
	 for(int i=0;i<n;i++)
	 {
	    arr[i]=sc.nextInt();
	 }
	 for(int i=0;i<n*2;i++)
	 {
	    res[i]=arr[i%n]; 
	 }
	 for(int i=0;i<n*2;i++)
	 {
	   System.out.print(res[i]+ " ");
	 }
  }
}