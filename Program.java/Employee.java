//Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
//Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%
import java.util.*;
public class Employee
{
  public static void main(String x[])
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Employee Salary");
	double basicsalary=sc.nextInt();
	double HRAPercentage=(basicsalary<=10000)?0.20:(basicsalary<=20000)?0.25:0.30;
	double DAPercentage=(basicsalary<=100000)?0.80:(basicsalary<=20000)?0.90:0.95;
	double HRA =basicsalary*HRAPercentage;
	double DA = basicsalary*DAPercentage;
	double Grosssalary=basicsalary+HRA+DA;
	System.out.println("Gross salary="+Grosssalary);
  }
}
