/*10. Rotate Array by K Steps
Description:
Rotate the list right by k positions.
Example:
Input: nums=[1,2,3,4,5], k=2
Output: [4,5,1,2,3]
*/
import java.util.*;
public class Rotate
{
  public static void main(String args[])
  {
     ArrayList<Integer> al=new ArrayList<>();
	 al.add(1);
	 al.add(2);
	 al.add(3);
	 al.add(4);
	 al.add(5);
	 
	 int cout=0;
	 for(int i=0;i<=2;i++)
	 {
		int a=al.get(cout);
		al.add(a);
		al.remove(cout);
	 }
	 
	 for(int num:al)
	 {
		System.out.println(num); 
	 }
  }
}