import java.util.*;
public class MAXApp
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
	int s=sc.nextInt();
	int arr[]=new int[s];
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
    }
	int result=findMax(arr);
	System.out.println("max  "+result);
	findMin(arr);
	
  }
  public static int findMax(int a[])
  {
    int max=a[0];
	for(int i=0;i<a.length;i++)
	{
	 if(a[i]>max)
       {
	     max=a[i]; 
       }	   
	}return max;
  }
  public static void findMin(int a[])
  {
	  int min=a[0];
	  for(int i=0;i<a.length;i++)
	  {
		   if(a[i]<min)
		   {
			   min=a[i];
		   }
		  
	  } System.out.println("min "+min);
  }
}