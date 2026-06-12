//Q18. Write a Java program to convert days to years, month and week.
import java.util.*;
public class ConvertToYear
{
  public static void main(String x[])
  {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Days:");
	 int days=sc.nextInt();
	 int Year=days/365;
	 int reamingdays=days%365;
	 int weeks=reamingdays/7;
	    days=reamingdays%7;
     System.out.println("num of year:" +Year+ " Year weeks:" +weeks+ " Weeks days:" +days);		
  }
}