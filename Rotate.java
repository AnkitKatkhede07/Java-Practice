/*5.Right Rotate an Array by 1 or K Positions
Concept: Shift elements to the right and bring the last to front.
 Use Case: Buffer manipulation.
Input: arr = [10, 20, 30, 40, 50]
Right rotated array by 2 positions: [40, 50, 10, 20, 30]
*/
public class Rotate
{
   public static void main(String args[])
   {
      int arr[]={10,20,30,40,50}
	  System.out.println("Arrya in Element : ");
	  for(int num:arr)
	  {
	  System.out.println(num);
	  }
	  for(int i=0;i<arr.length;i++)
	  {
	     for(int j<arr.length;i<=3;j--)
		 {
		    arr[i]=arr[j];
		 }
		 for(int i=0;i<arr.length;i++)
		 {
		   System.out.println(arr[i]+" ");
		 }
	  }
   }
}