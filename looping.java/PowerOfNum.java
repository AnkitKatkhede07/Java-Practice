//Q16. Write a java program to find power of a number.
import java.util.*;
public class PowerOfNum
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a power of base");
   int base=sc.nextInt();
   System.out.println("Enter a power of index");
   int index=sc.nextInt();
   int power=1;
   while(index!=0)
   {
     power = power*base;
  --index; 
   }
   System.out.println("power of a number:"+power);
  }
}