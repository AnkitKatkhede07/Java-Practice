import java.util.*;
public class Serach
{
public static void main(String x[])
{
Scanner sc = new Scanner(System.in);
  int num[]=new int[8];
  int key=20;
  System.out.println("Enter array element");
  for(int i=0;i<num.length;i++)
  {
    num[i]=sc.nextInt();
  }
  int index=linear(num,key);
  if(index==-1)
  {
	  System.out.println("not found");
  }
  else
  {
	  System.out.println("key od index :"+index);
  }
  }
  public static int linear(int num[],int key)
  {
    for(int i=0;i<num.length;i++)
	{
	if(num[i]==key)
	  {
	     return i;//return index when found
	  }
	}
	return -1;
 }
}