/*Q7. Write a java program to Remove all even numbers from an integer ArrayList.
Explanation:
 This teaches:
Removing elements using remove(index)
Handling shifting of elements after removal
Reverse loop concept
*/
import java.util.*;
public class ArrayList8
{
  public static void main(String args[])
  {
    ArrayList<Integer>al=new ArrayList<>();
	al.add(10);
	al.add(30);
	al.add(50);
	al.add(80);
	al.add(60);
	al.remove(0);
	 for(int num:al)
	{
	  System.out.println(num);
	}  
	System.out.println("Reverse ArrayList in :::");
	 for(int i=al.size()-1;i>=0;i--)
	 {
		  System.out.println(al.get(i));
	 }
  }
}