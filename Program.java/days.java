// Write a java program to input week number(1-7) and print 
 //the corresponding day of week name using if else.
 //How to print day of week using if else in java programming.
import java.util.*;
public class days
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a days number");
   int week=sc.nextInt();
   if (week == 1) 
   {
     System.out.println("Sunday");
   } else if (week == 2) 
   {
     System.out.println("Monday");
   } else if (week == 3) 
   {
     System.out.println("Tuesday");
   } else if (week == 4) 
   {
     System.out.println("Wednesday");
   } else if (week == 5) 
   {
    System.out.println("Thursday");
   } else if (week == 6) 
   {
    System.out.println("Friday");
   } else if (week == 7) 
   {
    System.out.println("Saturday");
   } else 
   {
    System.out.println("Invalid week number! Please enter between 1 and 7.");
   }
  
 }
}