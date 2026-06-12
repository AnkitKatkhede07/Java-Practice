/*Q3. Write a program to find the maximum value from an integer ArrayList.
Explanation:
 You will learn:
How to compare elements
Store maximum value manually
Logical thinking without built-in methods
*/
import java.util.*;
public class ArrayList3
{
   public static void main(String args[])
   {
      ArrayList <Integer>al=new ArrayList<>();
	   al.add(10);
	  al.add(80);
	  al.add(30);
	  al.add(40);
	  al.add(50);
	  int max=al.get(0);
	  for(int i=0;i<al.size();i++)
	  {
	     if(max<al.get(i))
		 max=al.get(i);
	  }System.out.println(max);
   }
}