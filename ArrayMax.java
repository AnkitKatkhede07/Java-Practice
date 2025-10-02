/*Q1. Find Maximum Element in Array
Class: ArrayMax
Functions:
void inputArray(int arr[]) → take array input
int findMax(int arr[]) → display maximum element
int findMin(int arr[]) → display minimum element*/
class Max
{
void intputArray(int ...arr)
{
   int small=Integer.MAX_VALUE;
   int findMax([]...arr)
   {
    for(int i=0;i<arr.length;i++)
	 {
		 if(small>arr[i])
		 {
			small=arr[i]; 
		 } 
	 }return small;
  }
  int greater=Integer.MIN_VALUE;
  int findMin(...arr)
  {
  for(int i=0;i<arr.length;i++)
  {
    if(greater>arr[i])
	{
	  greater=arr[i];
	}
  }return greater;
  }
   }
}
public class ArrayMax
{
  public static void main(String args[])
  {
    int []m= new int []{1,3,4,5,6,8};
	inputArray a=new inputArray();
	a.findMax(m);
	a.findMin(m);
	for(int i=0;i<m.length;i++)
	{
		System.out.println(m[i]);
	}
	//int result = return;
	//int result2=return;
  }
}
