/*Q57. Write a program to input an employee level (1-3) and display the salary range:
1: Junior (20,000 - 30,000)
2: Mid (31,000 - 50,000)
3: Senior (51,000 - 80,000)
Explanation:
 Use switch on the level number and print the salary range.*/
 import java.util.*;
 public class EmployeProg
 {
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a level number of employee");
	int level=sc.nextInt();
	switch(level)
	{
	case 1:
	System.out.println("Enter a salary of employee");
	 int salary=sc.nextInt();
	if(salary>20000&&salary<30000)
	{
	 System.out.println(" this employee is Junior");
	}
	else
	{
	 System.out.println("Invalid amount or employee");
	}
	
	break;
	case 2:
	System.out.println("Enter a salary of employee");
	 salary=sc.nextInt();
	if(salary>31000&&salary<50000)
	{
	System.out.println("Mid");
	}
	else
	{
	 System.out.println("Invalid amount or employee");
	}
	break;
	case 3:
	System.out.println("Enter a salary of employee");
	 salary=sc.nextInt();
	if(salary>51000 && salary<80000)
	{
	System.out.println("Senior");
	}
	else 
	{
	System.out.println("Invalid amount or employe");
	}
	break;
	default :
	System.out.println("choise a correct case or level ");
	}
  }
 }
