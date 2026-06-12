//Q38
import java.util.*;
public class Eligible
{
public static void main(String []args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a marks");
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a Attendance");
 int Attendance=sc.nextInt();
 System.out.println("select");
 int select=sc.nextInt();
 switch(select){
 case 1:
 if(Attendance >=75% && marks>=80)
 {
  System.out.println("this Eligible");
 }
 else
 {
  System.out.println("this not Eligible");
 }
 break;
 default :
     {
     System.out.println("Incorrect case");
     }
 }
}
}