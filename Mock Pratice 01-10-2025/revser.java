import java.util.*;
public class revser 
{
  public static void main(String x[])
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter arrya size from User:");
  int s=sc.nextInt();
  System.out.print("Enter arrya Element from User:");
int arr[]=new int [s];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
 System.out.println("Dislay arrays:");
for(int i=0;i<arr.length;i++)
{
  System.out.println(arr[i]+" ");
}
System.out.println("Revser the arrays:");
for(int i=arr.length-1;i>=0;i--)
{
  System.out.println(arr[i]+" ");
}
}
}