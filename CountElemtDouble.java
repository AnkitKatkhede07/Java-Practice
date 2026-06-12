import java.util.*;
public class CountElemtDouble
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("ENter arrya size of Element:");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 int same[]=new int [size];
	 int visited=-1;
	 for(int i=0;i<size;i++)
	 {
	    arr[i]=sc.nextInt();
	 }
	 for(int i=0;i<size;i++)
	 {  int count=1;
	   for(int j=i+1;j<size;j++)
	   {
	     if(arr[i]==arr[j]){
		 count++;
		 same[j]=visited;
		 }
	   }
	 
	   if(same[i]!=visited)
	   {
	     same[i]=count;
	   }
	 }
	   System.out.println("\n Element in Array");
	   for(int i=0;i<size;i++)
	   {
		   if(same[i]!=visited){
	      System.out.println(+arr[i]+"occurs"+same[i]+"time");
	   }
	   }
	 
  }
  
}