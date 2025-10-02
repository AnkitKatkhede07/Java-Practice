/*Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5
*/
import java.util.*;
public class Specific
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a size of array:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter a element in array:");
	for(int i=0;i<size;i++)
	{
	 arr[i]=sc.nextInt();
	}
	System.out.println("Enter a element:");
	int index = sc.nextInt();
	System.out.println("Enter value to insert:");
	int value = sc.nextInt();
	//Create new array with one extra space
	int newArr[]=new int[size+1];
	for(int i=0,j=0;i<newArr.length;i++)
	{
	   if(i==index){
		   newArr[i]=value;//insert value
	   }  
    else{
	   newArr[i]=arr[j];//copy old element
	   j++;
	   }
	}
	System.out.println("Output of Element:");
	for(int i=0 ;i<newArr.length;i++)
	{
	   System.out.println(newArr[i]+" ");
	}
	sc.close();
  }
}