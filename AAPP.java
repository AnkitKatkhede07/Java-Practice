import java.util.*;
public class AAPP
{
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
     int val=Integer.parseInt(args[0]);
	 int arr[]=new int[val];
	 for(int i=0;i<arr.length;i++)
	 {
	    arr[i]=sc.nextInt();
	 }
	 float result=perAPP(arr);
	 System.out.println(result);
  }
  public static float perAPP(int a[])
  {
      int arrgs=0;
	  for(int i=0;i<a.length;i++)
	  {
	    arrgs=arrgs+a[i];
	  }return ((float)arrgs)/a.length;
  }
}