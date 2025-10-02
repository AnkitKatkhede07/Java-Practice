/*6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3*/
import java.util.*;
public class EvenOddNum
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Arraya Size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter a Array elements");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	 int evenCount = 0, oddCount = 0;
	for(int i=0;i<arr.length;i++)
	{
	  if(arr[i]%2==0)
	  {
		evenCount++;
	  }
	  else
	  {
	   oddCount++;
	  }
	}System.out.println("Even :"+ evenCount + ", Odd: " + oddCount);
  }
}
