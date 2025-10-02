/*Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5*/
import java.util.Scanner;
public class DeleteArray
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Array Size:");
  int size=sc.nextInt();
  int arr[]=new int[size];
  System.out.println("Enter element in array:");
  for(int i=0;i<arr.length;i++)
  {
     arr[i]=sc.nextInt();
  }
  System.out.println("Enter a element:");
	int index = sc.nextInt();
	 //int newArr[] = new int[size - 1];
    if (index < 0 || index >= size) 
	   {
            System.out.println("Invalid index!");
            return;
	   }
       int newArr[]=new int[size-1];
    for (int i = 0, j = 0; i < size; i++) {
            if (i == index) 
			{
               continue; // skip the element at the given index
            }
            newArr[j++] = arr[i];
        }
  System.out.println("Output element");
  for(int i=0;i<newArr.length;i++)
  {
    System.out.println(newArr[i]+"");
  }
 }
}