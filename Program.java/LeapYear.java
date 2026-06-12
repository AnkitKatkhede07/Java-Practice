/*Q51: Write a Java program using a switch case to input a month number (1-12) 
and display the number of days in that month. Consider leap year for February.
Explanation:
 Use a switch for month numbers. For February, check if the year is a leap year
 using an if condition inside the case.*/
 import java.util.Scanner;
 public class LeapYear
 {
 public static void main(String[]args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a year :");
  int year=sc.nextInt();
  System.out.println("Enter a Month Number (1-12):");
  int month=sc.nextInt();
  switch(month)
  {
  case 1://january
  case 3://march
  case 5://may
  case 7://July
  case 8://August
  case 10://Octaber
  case 12://December
  System.out.println("31 days");
  break;
  case 4://April
  case 6://June
  case 9://September
  case 11://November
  System.out.println("30 days");
  break;
  case 2://February
  //leap year check
  if((year%4 ==0 && year%100!=0) || (year % 400 == 0))
  {
  System.out.println("29 days(leap Year)");
  }
  else{
  System.out.println("28 days");
  }
  break;
  default:
  System.out.println("Invalid month number! Enter between 1to12:");
 }
 }
 }