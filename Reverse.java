/*4.Reverse an Array
Concept: Swap elements from both ends moving toward the center.
 Use Case: Invert order of operations or list of commands.
Example: arr = [10, 20, 30, 40, 50]
Reversed array: [50, 40, 30, 20, 10]
*/
public class Reverse
{
  public static void main(String args[])
  {
     int arr[]={10,20,30,40,50};
	 // System.out.println("Array in display is:");
	 // for(int num : arr)
	 // {
	    // System.out.println(num);
	 // }
	 // System.out.println("Reversed arrya");
	 // for(int i=arr.length-1;i>=0;i--)
	 // {
	   // System.out.println(" "+arr[i]);
	 // }
	 // System.out.println();
	 int first=0;
	 int last=arr.length-1;
	 while(first<last)
	 {
		  int temp=arr[last];
		  arr[last]=arr[first];
		  arr[first]=temp;
		  first ++;
		  last --;
		  
	 }
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]+" ");
	 }
  }
}