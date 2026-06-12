// Q30. Write a java program to enter month number between(1-12) and print number of days
// in month using if else. 
//How to print the number of days in a given month using if else in java programming
import java.util.*;
public class MonthsOfDays
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a month");
  int month=sc.nextInt();
  if (month==1||month==3||month==4||month==5||month==7||month==8||month==10||month==12)
  {
    System.out.println("This months 31 days");
  }
  else if(month==4||month==6||month==9||month==11)
  {
   System.out.println("this months 30 Days");
  }
  else if(month==2)
  {
    System.out.println("this months 28or30 Days");
  }
  else 
  {
  System.out.println("invaild months recorrect a month");
  }
 }
}