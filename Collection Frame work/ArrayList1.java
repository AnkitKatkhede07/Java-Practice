/*ArrayList :- 
Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
Explanation:
	This helps you understand:
How to declare an ArrayList
How to add elements using add()
How to traverse an ArrayList using for loop*/
import java.util.*;
public class ArrayList1
{
   public static void main(String args[])
   {
      ArrayList<Integer>al=new ArrayList<>();
	  al.add(10);
	  al.add(20);
	  al.add(30);
	  al.add(40);
	  al.add(50);
	  for(int arr :al)
	  {
	    System.out.println(arr);
	  }
	  
   }
}
