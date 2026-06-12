//Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
//— using nested ternary operators.
import java.util.*;
public class TernaryOperation
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a marks");
  int marks = sc.nextInt();
  System.out.println("Enter a marks of student");
  String str=(marks>=90)?"Excellent":(marks>=75)?"Good":(marks>=50)?"Average":(marks<50)?"Poor":"fail";
  System.out.println(str);
 }
}