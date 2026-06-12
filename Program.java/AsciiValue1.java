//write java program to print the Ascii value of a give character
import java.util.*;
public class AsciiValue1
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character of Ascii value");
    char ch=sc.next().charAt(0);
	
	//System.out.println("Char Values=========>  "+ch);
	int value=(int)ch;
	
	System.out.println("this is Ascii value:"+value);
  }
}