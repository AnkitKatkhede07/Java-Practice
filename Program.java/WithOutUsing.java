//Write a java progaram swap 2 num without using 3 rd variable
import java.util.*;
public class WithOutUsing
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num for A:");
	int a=sc.nextInt();
	System.out.println("Enter a num for B:");
	int b=sc.nextInt();
	System.out.println("befor swaping A:"+a+"befor swaping B:"+b);
	a=a+b;//30+20=50
	b=a-b;//30-50=20
	a=a-b;//20-50=20
	System.out.println("After swaping A:"+a+"After swaping B:"+b);
	
//XoR operater
  System.out.println("Enter a num of A:");
  int c=sc.nextInt();
  System.out.println("Enter a num of B:");
  int d=sc.nextInt();
  System.out.println("Before swap A:"+c+"before swaping B:"+d);
    c=c^d;
	d=c^d;
	c=c^d;
  
  System.out.println("After swaping A:"+c+"After swaping B:"+d);
	
  }
}
