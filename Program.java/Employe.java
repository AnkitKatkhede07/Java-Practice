/*Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.
 
*/
import java.util.*;
public class Employe
{
 public static void main(String x[])
 {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a service year");
	int service=sc.nextInt();
	System.out.println("Enter a salary");
	double salary=sc.nextInt();
	if(service>=5)
	{
	double bonus= 0.05 * salary;//double bonus = 0.05 * salary;
	 System.out.println("amount of bonus is :"+bonus);
	}
	else {
	System.out.println("no bonus");
	}
 }
}