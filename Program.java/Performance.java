/* Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.
*/
import java.util.*;
public class Performance
{
  public static void main(String x[])
  {
  int salary,service,rating;
  double hike;
   Scanner sc = new Scanner(System.in);
   System.out.println("The Basic salary of employee");
   salary=sc.nextInt();
   System.out.println("The Years of service employee");
   service=sc.nextInt();
   System.out.println("The performance of rating employee");
   rating=sc.nextInt();
   if(rating>=4&&service>=5)
   {
    hike=0.20*salary;
   System.out.println("if rating and service is :"+hike);
   }
   else if(rating>=3)
   {
    hike=0.10*salary;
   System.out.println("if rating is :"+hike); 
   }
   else
   {
    hike=0.05*salary;
   System.out.println("if is hike:"+hike);
   }
   double newsalary=salary+hike;
   System.out.println("the new salary of employee:"+newsalary);
  }
}