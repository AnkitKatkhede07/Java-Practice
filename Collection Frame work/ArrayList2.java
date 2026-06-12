/*Q2. Create an ArrayList of integers and calculate the sum of all elements.

	Explanation:
	 This question practices:
Iterating over ArrayList
Performing arithmetic operations
Using get(index) method
*/
import java.util.*;
public class ArrayList2
{
  public static void main(String args[])
  {
     ArrayList <Integer> al=new ArrayList<>();
	 al.add(10);
	 al.add(20);
	 al.add(30);
	 al.add(30);
	 al.add(20);
	 int sum=0;
	 for(int i=0;i<al.size();i++)
	 {
	    sum +=al.get(i);
	 }
	 System.out.println("Sum of all Element = "+sum);
  }
}