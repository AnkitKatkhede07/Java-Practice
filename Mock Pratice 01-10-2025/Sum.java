//3. Calculate the Sum and Average of Elements
import java.util.*;
public class Sum{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Array Elements Size:");
  int size=sc.nextInt();
  int a[]=new int [size];
  System.out.println("Enter Array Elements:");
  for(int i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
  }
  int sum=0;
  for(int i=0;i<a.length;i++)
  {
     sum=sum+a[i];
  }System.out.println("Sum of arryas is :"+sum);
  
}

}