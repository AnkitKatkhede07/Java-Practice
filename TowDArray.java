import java.util.*;
public class TowDArray
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Arrays Size:");
   int size=sc.nextInt();
   int arr1[][]=new int[size][size];
   int arr2[][]=new int[size][size];
   System.out.println("Enter Arrays 1st element:");
   for(int i=0;i<arr1.length;i++){
   for(int j=0;j<arr2[i].length;j++){
    arr1[i][j]=sc.nextInt();
   }
   }
   for(int i=0;i<arr1.length;i++)
   {
	   arr1[i]=sc.nextInt();
   }//incomplement 
   for(int i=0;i<arr1.length;i++)
   {
     System.out.println(arr1[i]+" ");
   }
 }
}