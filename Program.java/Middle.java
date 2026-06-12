import java.util.*;
public class Middle
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number A,B,C");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  if(a>b&&a<c)
  {
   System.out.println("Middle value is A"+a);

  }
  else if(b<c)
  {
     System.out.println("Middle value is B"+b);
  
  }
  else
  {
	System.out.println("Middle value is C"+c);  
  }
 }
}