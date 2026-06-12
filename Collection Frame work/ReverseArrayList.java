/*Q8. Write a java program to Reverse an integer ArrayList without using inbuilt reverse method.
Explanation:
 This improves:
Index manipulation
Swapping logic
Understanding list size
*/
import java.util.*;
public class ReverseArrayList
{
  public static void main(String args[])
  {
     ArrayList <Integer> al=new ArrayList<>();
	 al.add(10);
	 al.add(20);
	 al.add(30);
	 al.add(40);
	 al.add(50);
	 al.add(60);
	 for(int num:al)
	 {
	    System.out.println(num);
	 }
	 System.out.println("Show ReverseArrayList");
	 try{
		 int start=0;
		 int end=al.size()-1;
		 while(start<end)
		 {
			  int temp=al.get(start);
			  al.set(start,al.get(end));
			  al.set(end, temp);
			  
			  start++;
			  end--;
			 
		 } System.out.println(al);
	  }	

	 catch(Exception ex)
	 {
		System.out.println(ex);
	 }
  }
}