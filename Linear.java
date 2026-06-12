/*2.Search for an Element (Linear Search)
Concept: Traverse array linearly and compare each value with the target.
  
arr = [10, 20, 30, 40, 50]
Enter search key  : 30
Output: value found
Enter search key: 300
Output: value not found 
*/
import java.util.Scanner;
public class Linear
{
   public static void main(String args[])
   {
   int []arr =  {10,20,30,40,50};
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Search Key:");
	 int key=sc.nextInt();
	 boolean found =false;
	 for(int num:arr)
	 {
	 if(key==num)
	 {
	    found=true;
		break;
	 }
	 }
	 if(found)
	 System.out.println("target is there");
	 else
	 System.out.println("target is not found");
   }
}