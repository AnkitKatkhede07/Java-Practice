import java.util.*;
public class Fabo
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of arrya:");
  int size=sc.nextInt();
  int arr[]=new int[size+1];
   Arrays.fill(arr,-1);
   for(int i=0;i<=size;i++)
   {
     int result=fib(i,arr);
	 System.out.println(result);
   }   
 }
 public static int fib(int n ,int arr[])
 {
    if(n<=1)
	{
	  arr[n]=n;
	 return n;
	}
	if(arr[n]!=-1)
	{
	  return arr[n];
	}
	arr[n]=fib(n-1,arr)+fib(n-2,arr);
	return arr[n];
 }
}