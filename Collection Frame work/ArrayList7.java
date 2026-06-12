/*Q6. Write a java program to Check whether a given number exists in an ArrayList.
Explanation:
 You learn:
Linear search logic
Use of flag variable
Comparison using loop
*/
import java.util.*;
public class ArrayList7
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  ArrayList <Integer>al=new ArrayList<>();
	  al.add(45);
	  al.add(5);
	  al.add(20);
	  al.add(30);
	  al.add(30);
	  al.add(2);
	  int key=25;
	  boolean found=false;
	  for(int i=0;i<al.size();i++)
	  {
	     if(al.get(i)==key)
		 {
		    found=true;
			break;
		 }
	  }
	  if(found)
	  {
	   System.out.println("Search key found");
	  }
	  else
	  {
	    System.out.println("Search key is not found");
	  }
	  
   }
}