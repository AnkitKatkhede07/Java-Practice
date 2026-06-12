/*Q9. Write a java program to Copy all elements from one integer ArrayList to another.
Explanation:
 This practices:
Working with multiple ArrayList objects
Element-by-element copying
*/
import java.util.*;
public class Copy
{
  public static void main(String args[])
  {
      ArrayList<Integer> al = new ArrayList<>();
	  al.add(1);
	  al.add(2);
	  al.add(3);
	  al.add(4);
	  al.add(5);
	  al.add(6);
	  System.out.println("1st aaraya bshsh");
	  System.out.println("2 array in from");
	  for(int no:al)
	  {
	    System.out.println(no);
	  }
	  
	  ArrayList<Integer> list = new ArrayList<>();
	  list.addAll(al);
	  System.out.println("2 array in from");
	  for(int num:list)
	  {
	    System.out.println(num);
	  }
  }
}