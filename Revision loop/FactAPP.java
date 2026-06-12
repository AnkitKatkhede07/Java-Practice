import java.util.*;
public class FactAPP
{
    public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	   int no,f=1;
	   System.out.println("Enter number from keyboard");
	   no=xyz.nextInt();
	   while(no!=0)
	   {
	     f=f*no;
		 no--;
	   }
	   System.out.printf("Factorial is %d\n",f);
	}
}
