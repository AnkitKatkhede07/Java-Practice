/*Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation:
 Use a char or string in switch to match grades and print remarks.*/
 import java.util.*;
 public class RemarkUsing
  {
   public static void main(String []args)
   {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a charater (A, B, C, D, F):");
	char grade=sc.next().toUpperCase().charAt(0);
	switch(grade)
	{
	 case 'A':
	 System.out.print("Excellent");
	 break;
	 case 'B':
	 System.out.print("Good");
	 break;
	 case 'C':
	 System.out.print("Average");
	 break;
	 case 'D':
	 System.out.print("Poor");
	 break;
	 case 'F':
	 System.out.println("Fail");
	 break;
	 default :
	 System.out.println("invalid input plz! recorrect input");
	}
   }
  }
