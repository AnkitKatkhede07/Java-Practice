
/*Q5. Store numbers in an ArrayList and count how many are even and how many are odd.
Explanation:
 This helps practice:
Modulus operator %
Condition-based counting
Iteration over collections
*/
import java.util.*;
public class ArrayList6
{
   public static void main(String args[])
   {
      ArrayList <Integer> al=new ArrayList<>();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter arrya list in Size");
	  int n=sc.nextInt();
	  System.out.println("Enter arryalist Element");
	  for(int i=0;i<n;i++)
	  {
	    al.add(sc.nextInt());
	  }
	  int EvenCount=0;
	  int oddCount=0;
	  System.out.println("Show counting Even or odd");
	  for(int i=0;i<al.size();i++)
	  {
	   
	  if(al.get(i)%2==0)
	  {
		 EvenCount++;
	  }
	  
	  else
	  {
		    oddCount++;
	  }
	  }
	   System.out.println("Even count is:  "+EvenCount);
	   System.out.println("Odd count is:   "+oddCount);
   }
}