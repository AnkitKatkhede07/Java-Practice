//Implement substring method with overloaded version
import java.util.*;
public class TOWSUM
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter size of Arrya");
	 int S=sc.nextInt();
	 int arr[]=new int[S];
	 System.out.println("Enter Element in Arrya:");
	 for(int i=0;i<arr.length;i++)
	 {
	    arr[i]=sc.nextInt();	
	 }
	 int sum=0;
	 System.out.println("Enter a target number");
	 int target=sc.nextInt();
	 boolean flag=false;
	 for(int i=0;i<arr.length;i++)
	 {
		  for(int j=i+1;j<arr.length;j++)
		  {
			   sum=arr[i]+arr[j];
			   if(sum==target)
			   {
				    System.out.println(i+" "+j);
					flag=true;
					break;
					
			   }

		  } 
	 }
	 if(flag)
	 {
	   System.out.println("found");

	 }
	 else
	 {
		 System.out.println("not found");
	 }
   }
}