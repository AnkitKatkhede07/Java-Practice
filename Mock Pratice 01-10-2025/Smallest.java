//2. Find the Smallest Element in an Array
import java.util.*;
public class Smallest{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Arrya Size in Element:");
  int size=sc.nextInt();
  int arr[]=new int[size];
  System.out.println("Enter Arrya in Element:");
  for(int i=0;i<arr.length;i++)
  {
    arr[i]=sc.nextInt();
  }
  int smallest=Integer.MAX_VALUE;
  for(int i=0;i<arr.length;i++)
  {
  if(smallest>arr[i])
  {
    smallest=arr[i];
	
  }
  }System.out.println("the Smallest Number is:"+smallest);
}
}