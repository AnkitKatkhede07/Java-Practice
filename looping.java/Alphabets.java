//Write a C program to print all alphabets from a to z. - using while loop
import java.util.*;
public class Alphabets
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	//System.out.println("Enter a Charater:");
	//char ch=sc.next().CharAt(0);
	char ch='A'; 
	while(ch <='Z')
	{
	 System.out.println(ch+"");
	 ch++;
	}
  }
}