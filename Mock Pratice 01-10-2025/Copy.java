//6. Copy One Array into Another
import java.util.*;
public class Copy{
public static void main(String x[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter array size:");
  int size=sc.nextInt();
  int arr[]=new int[size];
  System.out.println("Enter array Element:");
  for(int i=0;i<arr.length;i++)
  {
    arr[i]=sc.nextInt();	
  }
   // Create a new array of the same size
        int copyArr[] = new int[arr.length];
        
        // Copy elements
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        
        System.out.println("Elements copied successfully!");
        System.out.println("Copied Array:");
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
  
}
}