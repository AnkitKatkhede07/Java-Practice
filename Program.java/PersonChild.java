/*Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
*/
import java.util.*;
public class PersonChild
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a age of person");
	int age=sc.nextInt();
	if(age<=12)
	{
	  System.out.println("child");
	}
	else if(age>=13 && age<=19)
	{
	  System.out.println("teenager");
	}
	else if(age>=20 && age<=59)
	{
	  System.out.println("adult");
	}
	else if(age>=60)
	{
	  System.out.println("senior");
	}
	else 
	{
	System.out.println("Invalid age input.");
	}
  }
}