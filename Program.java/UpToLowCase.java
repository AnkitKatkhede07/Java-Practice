/*Example: WAP to input character from keyboard and convert lower case character to upper case and upper case character to lower 
Input:  a 
Output: A

Note: if we want to solve above Problem we required to know the ASCII code 
*/
import java.util.*;
  public class UpToLowCase
  {
  public static void main(String []args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a character");
  char ch=sc.nextLine().charAt(0);
  int value=(int)ch;
  if (ch>65 && ch<=90)
  {
	  ch+=32;
	System.out.println(+ch);
  }
  else 
  {
	 ch-=32; 
	   System.out.println(ch);
  }
  }
  }