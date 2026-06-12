/*Q4. Create an ArrayList and find the minimum element.
Explanation:
 Similar to max logic, this improves:
Conditional checking
Traversal logic
*/
import java.util.*;
public class ArrayList4
{
 public static void main (String args[])
 {
    ArrayList <Integer> al=new ArrayList<>();
	/*  al.add(10);
	 al.add(20);
	 al.add(30);
	 al.add(30);
	 al.add(2); */
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Array List Size:");
	 int n=sc.nextInt();
	 System.out.println("ENter a Element in:");
	 for(int i=0;i<n;i++)
	 {
		   al.add(sc.nextInt());
	 }
	 System.out.println("Show arryalistS");
	 
	  int min=al.get(0);
	 for(int i=0;i<al.size();i++)
	 {
	  if(al.get(i)<min)
	  min=al.get(i);
	 }System.out.println(min); 
 }
}