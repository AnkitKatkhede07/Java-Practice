public class Auto
{
 public static void main(String args[])
 {
    int n=25;
	int temp=n;
	 int sum=0;
	 int rem=0;
	while(temp!=0)
	{
	 sum=temp*temp;
	 int digit=sum%10;
	  rem=rem*10+digit;
	 temp/=10;
	}
	if(rem==n)
	{
	  System.out.println("yes"+sum);
	}
 }
}