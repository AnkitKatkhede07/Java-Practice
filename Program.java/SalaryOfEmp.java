//Write a Java program to calculate the net salary of an employee.
//Input: basic salary, HRA %, DA %, and tax %.
import java.util.*;
 public class SalaryOfEmp
 {
    public static void main(String x[])
 {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a Basic SalaryOfEmp");
 int Basicsalary=sc.nextInt();
 System.out.println("Enter HRA(House Rent Allowance)Emp");
 int HRA=sc.nextInt();
 System.out.println("Enter DA (Dearness Allowance)Emp");
 int DA=sc.nextInt();
 System.out.println("Enter a tax Emp");
 int tax=sc.nextInt();
 
 int Emp=Basicsalary+HRA+DA+tax;
 System.out.println("the basic salary of emp"+Emp);
 
  
 }

 }