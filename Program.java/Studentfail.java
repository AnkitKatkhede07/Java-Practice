//48. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
import java.util.*;
public class Studentfail
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a score of student");
 int score=sc.nextInt();
 /*if (score>=40)
 {
   System.out.println("this student is pass");
 }
 else
 {
  System.out.println("this is Fail");
 }*/
 String str=(score>=40)?"pass":"fail";
 System.out.println(str);
}
}