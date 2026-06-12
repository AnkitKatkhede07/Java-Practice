import java.util.*;
public class Amstrog
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number of User:");
	int n=sc.nextInt();
	findNum(n);
  }
  public static void findNum(int no)
  {  int temp=no;
     int sum=0;
	 int count=0;
	 //step 1:count digit
	 while(temp!=0)
	 {
		 temp=temp/10;
		 count++;
	 }
	     while(temp!=0)
		 {
			int digit=temp%10;
           int power=1;
			for(int i=0;i<=count;i++)
			{
				power=power*digit;
			}
			sum=sum+power;
			temp=temp/10;
		 }
		 
		 if(sum==no)
		 {
			  System.out.println("Amstrong number");
		 }
		 else
		 {
			 System.out.println("Amstrong is not number");
		 }
  }
}