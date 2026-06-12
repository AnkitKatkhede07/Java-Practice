/*Check whether a student is eligible for scholarship:
 
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not.
 */
 import java.util.*;
 public class Scholarship
 {
   public static void main(String x[])
   {
   int present,marks;
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a student Attendance");
	 present=sc.nextInt();
	 System.out.println("Enter a student marks");
	 marks=sc.nextInt();
	 if (present>=75 && marks>=80)
	 {
	 System.out.println("Eligible");
	 }
	 else 
	 {
	 System.out.println("not Eligible");
	 }
   }
 }
