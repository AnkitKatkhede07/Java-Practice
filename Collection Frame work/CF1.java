/*Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer*/
import java.util.ArrayList;
import java.util.*;
public class CF1
{
	public static void main(String args[])
	{
   ArrayList<Integer> al= new ArrayList<>();
   al.add(4);
   al.add(5);
   al.add(8);
   al.add(9);
   al.add(10);
   al.add(11);
   
   Iterator <Integer> I = al.iterator();
      while(I.hasNext())
	  {
		  Integer num=I.next();
      if(num%2==0)
    {
     I.remove();
	  }}
	  
  
     System.out.println(al);

	  
   
}
}
