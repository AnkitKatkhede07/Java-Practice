//Q18. Write a java program to remove duplicated values of arrays.
import java.util.Scanner;
import java.util.Arrays;
public class DuplicatedRemove
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);//Scanner
   System.out.println("Enter array size:");
   int s=sc.nextInt();
   System.out.println("Enter array element in :");
   int arr[]=new int[s];
   for(int i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }
   Arrays.sort(arr);
        // Temporary array to store unique elements
        int temp[] = new int[s];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        // Add the last element
        temp[j++] = arr[arr.length - 1];

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
		}
 }
}
///doublicate arrays element
/* boolean flag=true;
   for(int i=0;i<arr.length;i++)
   {
	  for(int j=i+1;j<arr.length;j++)
	  {		  
	   if(arr[i]==arr[j])
	   {
		   System.out.println(arr[i]+"="+arr[j]);
         flag=false;
	      
	   }//System.out.println(arr[i]+"");
	   else if(arr[i]==j)
	   {
		   System.out.println(arr[i]+"");
	   }
	   }
   
   }*/