import java.util.*;
public class PAPP1
{   public static void main(String x[])
	{ Scanner xyz  = new Scanner(System.in);
	   int no,sum=0,i;
	   System.out.println("Enter number from keyboard");
	   no=xyz.nextInt();
	   i=1;
	   while(i<no)
	   {
	      if(no%i==0)
		  {  sum  = sum + i;
		  }
		  i++;
	   }
	   String msg= no ==sum ?"Perfect":"Not Perfect";
	   System.out.println(msg);
	}
}
