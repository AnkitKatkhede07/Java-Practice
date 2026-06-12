/*Q61. Write a menu-driven program in java using switch case.
           	1.Addition
           	2.Subtraction
           	3.Multiplication
           	4,Division*/
 import java.util.*;
 public class MenuDriveAdd
 {
 public static void main(String x[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a suggestion");
  int suggestion=sc.nextInt();
  switch(suggestion)
  {
  case 1:
  System.out.println("Enter a value A");
  int a=sc.nextInt();
  System.out.println("Enter a value B");
  int b=sc.nextInt();
  int sum=a+b;
  System.out.println("Addition"+a+"+"+b+"="+sum);
  break;
  case 2:
  System.out.println("Enter a number A");
   a=sc.nextInt();
  System.out.println("Enter a value B");
   b=sc.nextInt();
   sum=a-b;
  System.out.println("Subtraction"+a+"-"+b+"="+sum);
  break;
  case 3:
  System.out.println("Enter a number A");
   a=sc.nextInt();
  System.out.println("Enter a value B");
   b=sc.nextInt();
   sum=a*b;
  System.out.println("Multiplication"+a+"*"+b+"="+sum);
  break;
  case 4:
  System.out.println("Enter a number A");
   a=sc.nextInt();
  System.out.println("Enter a value B");
   b=sc.nextInt();
   sum=a/b;
  System.out.println("Division"+a+"/"+b+"="+sum);
  break;
  case 5:
  System.out.println("Enter a number A");
   a=sc.nextInt();
  System.out.println("Enter a value B");
   b=sc.nextInt();
   sum=a%b;
  System.out.println("Addition"+a+"%"+b+"="+sum);
  break;
  default :
  System.out.println("Worng suggestion");
  }
 }
 }
