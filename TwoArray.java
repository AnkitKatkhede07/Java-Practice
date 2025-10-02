/*7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3 */
import java.util.*;
public class TwoArray
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter size of Element:");
	 int size=sc.nextInt();
	 int arr1[]=new int[size];
	 int arr2[]=new int[size];
	 //int n = ;
	 System.out.println("Enter Element 1Arrays");
	 for(int i=0;i<arr1.length;i++)
	 {
	   arr1[i]=sc.nextInt();
	 }
	System.out.println("Enter Element 2Arrays");
	 for(int i=0;i<arr2.length;i++)
	 {
	   arr2[i]=sc.nextInt();
	 }
	 System.out.println("output is:");
	/* for(int i=0;i<arr1.length;i++)
	 {
	    
	 }System.out.println(arr1[1]+" "+arr2[1]);
	 */
	  System.out.println("Intersection elements:");
     for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
           if (arr1[i] == arr2[j]) {//1 == 2//2==3//3==4//
		   System.out.print(arr1[i] + " ");
              break; // prevent printing same element multiple times for same i
                }
            }
        }
  }  
}

