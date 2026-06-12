//4. Search for an Element in an Array
import java.util.*;
public class Search{
 public static void main(String a[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Arrya size :");
   int size=sc.nextInt();
   int arr[]=new int[size];
   System.out.println("Enter Arrya in Element :");
   for(int i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }
   System.out.println("Enter Search key of arrya:");
   int key=sc.nextInt();
   boolean found=false;
   for(int i=0;i<arr.length;i++){
   if(arr[i]==key)
   {
     arr[i]=key;
     System.out.println("Search key is Found :"+arr[i]);
	 found= true;
	 break;
	 
   }
   }
    if(!found)
   {
   System.out.println("Search key is not Found :");
   }
   
 }
}