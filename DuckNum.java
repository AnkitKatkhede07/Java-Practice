//Q21. Write a java program to find the duck number of an array.
import java.util.Scanner;
public class DuckNum
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Size");
	int s=sc.nextInt();
	String arr[]=new String[s];
	System.out.println("Enter a element in arrays:");
	for(int i=0;i<arr.length;i++)
	{
	  arr[i]=sc.next();
	}
	System.out.println("DuckNum in arrays");
	for(int i=0;i<arr.length;i++)
	{
	  if (isDuck(arr[i])) {
                System.out.println(arr[i] + " is a Duck Number");
            }
        }
	}
	public static boolean isDuck(String num)
       {	
	    // Condition 1: Should not start with 0
        if (num.charAt(0) == '0') {
            return false;
        }
        // Condition 2: Should contain at least one zero
        return num.contains("0");
  }
}