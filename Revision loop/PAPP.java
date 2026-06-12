import java.util.*;
public class PAPP
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
       int base,index,p=1;
	   System.out.println("Enter base and index");
	   base=xyz.nextInt();
	   index=xyz.nextInt();
	   while(index!=0)
	   {  p =p * base;
	      --index;
	   } 
	   System.out.println("Power is  "+p);
   }
}
