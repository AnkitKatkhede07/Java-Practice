//Q42. Write a java program to read the age of a candidate and determine 
//whether he is eligible to cast his/her own vote.
import java.util.*;
public class AgeForCandidate
{
   public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a age of Candidate");
  int age=sc.nextInt();
  String str=(age>18)?"Congrates you are Eligible voteing":
  "Sorry you are not Eligible voteing";
  System.out.println(str);
  
 }
}