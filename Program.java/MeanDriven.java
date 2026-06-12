/*Q62. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers.
*/
import java.util.*;
public class MeanDriven
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("1:Check Number is positive , negative or zero");
  System.out.println("2:Check Number is even or odd.");
  System.out.println("3:Write a c program to find the max number using 2 numbers.");
  System.out.println("Enter a number");
  int num=sc.nextInt();
  System.out.println("Choice a number");
  int choice=sc.nextInt();
  switch(choice)
  {
   case 1:
   if(num>0){
   System.out.println("number is positive");
   }
   else{
   System.out.println("number is negative");
   }
   break;
   case 2:
   if(num%2==0)
   {
   System.out.println("Number is Even");
   }
   else{
   System.out.println("Number is odd");
   }
   break;
   case 3:
   int num2=20;
   if(num<num2)
   {
	   System.out.println("num is minimum:"+num);
   }
   else{
     	   System.out.println("num2 is minimum:"+num2);
      }	
  }
 }
}