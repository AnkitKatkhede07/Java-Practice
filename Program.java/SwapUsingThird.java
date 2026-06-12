//write java program swap 2 num using 3rd variable
import java.util.*;
public class SwapUsingThird
{
    public static void main(String x[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a char A:");
   int a=sc.nextInt();
   System.out.println("Enter a char B:");
   int b=sc.nextInt();
   System.out.println("before swaping a:"+a+"befor swaping b:"+b);
  int temp=a;
    a=b;
	b=temp;
	
  
   System.out.println("after swaping a:"+a+"after swaping b:"+b);
   
   
  }
}