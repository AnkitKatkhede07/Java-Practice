/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/
import java.util.*;
public class CF2
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 try{
	 System.out.println("Enter a Arrya Size");
	 int size=sc.nextInt();
	 int size1=sc.nextInt();
	 int arr[]=new int[size];
	 int arr2[]=new int[size1];
	 System.out.println("Enter Array in Eelement");
	 for(int i=0;i<arr.length;i++)
	 {
	   arr[i]=sc.nextInt();
	 }
	 System.out.println("Enter Array in Eelement");
	 
	 for(int i=0;i<arr2.length;i++)
	 {
	   arr2[i]=sc.nextInt();
	 }
	 }
	             System.out.println("Invalid input! Please enter a number.");


		 System.out.println("Array outbo");
	 
	 ArrayList <Integer> al=new ArrayList<>();
	 ArrayList <Integer> a=new ArrayList<>();
Catch(Exception  e)
	 {
	 for(int num:arr)
	 {
	   al.add(num);
	 }
	 for(int no:arr2)
	 {
		 a.add(no);
	 }
	 }
	 
	 
	 System.out.println("kujkg");
	 System.out.println("lkhg");
  }
 
}