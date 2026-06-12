import java.util.*;
public class TAPP
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
       int no,sum=0,i;
	   System.out.println("Enter number");
	   no=xyz.nextInt();
	   i=1;
	   while(i<=10)
	   {   System.out.printf("%d + %d ",sum,no);
           sum = sum + no;
	       System.out.printf(" = %d\n",sum);
		   i++;
	   }
   
   }
}
