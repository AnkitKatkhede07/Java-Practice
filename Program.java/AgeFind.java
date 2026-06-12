//Q.53.Given age, print category:
//Teen (13–19)
//Adult (20–59)
//Senior (60+)
import java.util.*;
public class AgeFind
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a age");
 int age=sc.nextInt();
 String category=(age>=13&&age<=19)?"Teen":
 (age>=20&&age<=59)?"Adult":
 (age>=60)?"Senior" : 
 "she is no more";
 System.out.println("this is category:"+category);
 }
}